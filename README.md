# Overview

Simple Java OST SDK built for non-administrative use. It supports Users, Transactions, Balance, and Ledger APIs.
This SDK is fully tested using separate testing code and mock service (contact for more info).

### Usage

Build and then include the Jar in your application classpath: 
```sh
$ mvn clean package
```
Create a new OST.properties in your resources directory as follow:
```sh
apiKey=xxxxxxxxxxxxxxx
apiSecretKey=xxxxxxxxxxxxxx
apiHost=https://xx.ost.com/vx.x
uuid=xxxxxxxxxx
```


Create a new OST default client:
```java
OST ost = OSTClientBuilder.defaultClient();
```


Create a new user:
```java
UsersDataResponse usersDataResponseNew = ost.createUser("test user");
```


Retrieve a newly created user:
```java
UsersDataResponse usersDataResponse = ost.retrieveUser(usersDataResponseNew.getData().getUser().getId());
```

Execute a user to user transaction:
```java
TransactionResponse transactionsExecutionResponse = ost.executeTransaction(
                usersDataResponse1.getData().getUser().getId(),
                usersDataResponse1.getData().getUser().getId(), 1111l /* action id can be found in OST dashboard*/
        );
```