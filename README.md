

Default userId: `Dummy_User` 

Default username for admin: `Dummy_Admin` and the password: `Dummy`

##### To `GET all books in the basket` use the following address and use GET request:

http://localhost:8080/showBooksInUserBasket/userId=Dummy_User

##### To `GET the price of the basket` use the following address and use GET request:

http://localhost:8080/totalPriceOfTheBasket/userId=Dummy_User

##### To `Delete a specific book` from the basket use the following address and `POST` the book that is already exist in the basket:


```
{
"title": "Mastering åäö",
"author": "Average Swede",
"price": 762,
"quantity": 1,
"description": "Dummy description",
"bookId": 0
}
```

Note that the `quantity` here is the quantity that we want to delete from the basket.

POST the above JSON object to the following address to delete the book from the basket:

http://localhost:8080/deleteFromBasket/userId=Dummy_User

##### To `Delete all books` from the basket send a POST request to the following address:

http://localhost:8080/deleteAllBooksFromBasket/userId={userId}

##### To `Search for a book` in the stock, use the following link and replace the searchString with your preferred phrase:

http://localhost:8080/search={searchString}

##### To `Get book quantity` from the stock, use the following link and POST the book details to get the quantity as a respond:

http://localhost:8080/getBookQuantity

```
{
"title": "Mastering åäö",
"author": "Average Swede",
"price": 762
}
```

It is enough to just send the title, author and price since these values will specify a unique book.

##### To `Buy all books` from the basket, use the following address and with a POST request:

http://localhost:8080/buyBooks/userId=Dummy_User


#### Book Store

##### To `Get all the books` from the stock, use the following link with a GET request:

http://localhost:8080/bookStock

##### To `Get orders list` use the following address with a GET request:

http://localhost:8080/bookStock/showOrders

##### To `Get all admins` use the following address with a GET request:

http://localhost:8080/bookStock/showAdmins

##### To `Get all users` use the following address with a GET request:

http://localhost:8080/bookStock/showUsers

##### To `Check if admin exist` use the following address with a GET request

http://localhost:8080/bookStock/isAdminExist/adminUserName=Dummy_Admin

##### To `Check if user exist` use the following address with a GET request

http://localhost:8080/bookStock/isUserExist/userId=Dummy_User


##### To `Check if a book exist` use the following address and POST the book object.

http://localhost:8080/bookStock/isBookExist


##### To `Check if the admin password is correct` use the following address and POST the user name and password:

http://localhost:8080/bookStock/isAdminPasswordCorrect

```
{
"username": "admin_user",
"password": "admin_pass"
}
```
