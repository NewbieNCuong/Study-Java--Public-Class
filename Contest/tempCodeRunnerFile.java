
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        int res = 0;
        String a = "";
        int cnt = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '-') {
                cnt += 1;
                continue;