
# Custom Querry
Custom Query using java Spring boot
## Framework

 - Java Spring Boot 
 - JPA
 - MySQL
 - Hibernate
 - lombok


## API Reference

#### Get all items

```http
  GET /student
```




#### Get By Name

```http
  GET /getStudent/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
|  `name`   | `String` |  Name to get|

#### Get Student List Sorted order

```http
  GET /sort
```

#### Get Student List Sorted order Limit 2

```http
  GET /sortlimit
```

#### Get Student By Age 

```http
  GET /getStudentage/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
|  `start`   | `int` | Start Age|
|  `end`   | `int` | End Age|


#### Get By FirstName and LastNane

```http
  GET /getStudentfnl/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
|  `Fname`   | `String` | First Name|
|  `Lname`   | `String` | Last Name|

#### Delete Student By Name

```http
  DELETE /delete/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
|  `name`   | `String` |  Name to Delete|



## Authors

- [@Yogesh](https://github.com/Yogesh-VasanthaKumar/)


