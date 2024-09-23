package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {

        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userManagerDatabase = new UserManager(userDatabaseProvider);
        System.out.println(userManagerDatabase.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWebService = new UserManager(webServiceProvider);
        System.out.println(userManagerWebService.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerNewDatabase = new UserManager(newDatabaseProvider);
        System.out.println(userManagerNewDatabase.getUserInfo());
    }
}
