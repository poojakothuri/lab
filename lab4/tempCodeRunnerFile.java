 Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("enter your username ");
        String usr=sc.next();
        System.out.println("enter your password ");
        String pswd=sc.next();
        System.out.println(usr+" "+pswd);
        System.out.println(pswd.equals("sbiBsx01"));
        account.verifyUser(usr,pswd);

    }} }