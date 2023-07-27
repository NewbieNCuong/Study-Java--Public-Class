/*
    Cấu trúc dữ liệu hàng đợi(Queue) - FIFO
    queue.push() - queue.pop() - queue.size() - queue.empty()
    queue.front()(Có nghĩa đẩy thằng cho vào đầu tiên)
*/

// In ra số nhị phân từ 1 đến n
// #include<bits/stdc++.h>
// using namespace std;

// vector<string> res;

// void sinh(){
//     queue<string> q;
//     res.push_back("1");
//     q.push("1");
//     while(res.size() < 10000){
//         string tmp = q.front();
//         q.pop();
//         res.push_back(tmp + "0");
//         res.push_back(tmp + "1");
//         q.push(tmp + "0");
//         q.push(tmp + "1");
//     }
// }

// int main(){
//     sinh();
//     int n; cin >> n;
//     for(int i = 0; i < n; i++){
//         cout << res[i] << " ";
//     }
// }

// In ra số bé nhất chia hết cho 1 số N
// #include<bits/stdc++.h>
// using namespace std;

// vector<string> res;
// queue<string> q;

// long long change(string s){
//     long long res = 0;
//     for(int i = 0; i < s.size(); i++){
//         res = res * 10 + (s[i] - '0');
//     }
//     return res;
// }

// void solve(){
//     res.push_back("9");
//     q.push("9");
//     while(1){
//         string tmp = q.front();
//         q.pop();
//         if(tmp.size() == 10) break;
//         res.push_back(tmp + "0");
//         res.push_back(tmp + "9");
//         q.push(tmp + "0");
//         q.push(tmp + "9");
//     }
// }

// int main(){
//     int t; cin >> t;
//     solve();
//     while(t--){
//         int n; cin >> n;
//         for(int i = 0; i < res.size(); i++){
//             if(change(res[i]) % n == 0){
//                 cout << res[i] << "\n";
//                 break;
//             }
//         }
//     }
// }

// // Bài toán biến một số thành một số thông qua các bước và tìm số bước ngắn nhất thì làm bằng queue
// #include<bits/stdc++.h>
// using namespace std;

// int solve(int s, int t){
//     queue<pair<int, int> > q;
//     q.push({s, 0});
//     set<int> se;
//     se.insert(s);
//     while(1){
//         pair<int, int> tmp = q.front();
//         q.pop();
//         if(tmp.first == t) return tmp.second;
//         if(tmp.first * 2 == t || tmp.second - 1 == t) return tmp.second + 1;
//         if(se.find(tmp.first * 2) == se.end() && tmp.first < t){
//             q.push({tmp.first * 2, tmp.second + 1});
//             se.insert(tmp.first * 2);
//         }
//         if(se.find(tmp.first - 1) == se.end() && tmp.first > 1){
//             q.push({tmp.first - 1, tmp.second + 1});
//             se.insert(tmp.first - 1);
//         }
//     }
// }

// int main(){
//     int t; cin >> t;
//     while(t--){
//         int dau, cuoi; cin >> dau >> cuoi;
//         cout << solve(dau, cuoi) << "\n";
//     }
// }

// Đường đi ngắn nhất trên lưới(bài toàn đồ thị cơ bản dùng queue)
#include<bits/stdc++.h>
using namespace std;

int a[1000][1000];
int d[1000][1000];

int dx[4] = {-1, 0, 0, 1};
int dy[4] = {0, -1, 1, 0};
pair<int, int> s, e;
int n, m;
void inp(){
    cin >> n >> m >> s.first >> s.second >> e.first >> e.second;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> a[i][j];
        }
    }
    memset(d, 0, sizeof(d));
}

int solve(){
    queue<pair<int, int> > q;
    q.push({s.first, s.second});
    d[s.first][s.second] = 0;
    while(!q.empty()){
        pair<int, int> top = q.front(); q.pop();
        //duyet 4 on xung quanh
        int i = top.first;
        int j = top.second;
        for(int k = 0; k < 4; k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(a[i1][j1] && i1 >= 0 && i1 < n && j1 >= 0 && j1 < m){
                a[i1][j1] = 0;
                if(i1 == e.first && j1 == e.second){
                    return d[i][j] + 1;
                }
                q.push({i1, j1});
                d[i1][j1] = d[i][j] + 1;
            }
        }
    }
    return -1;
}

int main(){
    inp();
    if(a[s.first][s.second] && a[e.first][e.second]){
        cout << solve();
    }
}