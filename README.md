# GreatLearning-RestEasy
## This is a basic Order management Rest api with some endpoints to manage Customers,Dishes,Vendors and Order Items.
### Spring Boot Framework is used with Mysql database and Api required some initial data in the database to operate.

## Api References-
### 1. List all Vendor (require no request payload)
       Url- http://localhost:8080/vendors (Http Method- Get)
       Response Payload- (List of Vendors if operation is successfull, Empty array in case of any exception on server side).
       
### 2. List all Vendor By DishName (require dishName as Path Variable)
       Url- http://localhost:8080/vendors/{dishName} (Http Method- Get)
       Response Payload- (List of VendorsAlongWithDish if operation is successfull, Empty array in case of any exception on server side).
       
   
### 3. List all Dishes (require no request payload)
       Url- http://localhost:8080/dishes (Http Method- Get)
       Response Payload- (List of Dishes if operation is successfull, Empty array in case of any exception on server side).

### 4. List all Dishes sorted on their price (require order="asc" for ascending sorting and order="desc" for descending sorting as request param in url)
       Url- http://localhost:8080/dishes/sort?order="" (Http Method- Get)
       Response Payload- (List of dishes if operation is successfull, Empty array in case of any exception on server side).


### 5. Add Quantity to existing orderItem (require payload of format Ex-> {"orderItemId"; int,"quantityToAdd": int)
       Url- http://localhost:8080/addQuantity (Http Method- Post)
       Response Payload- (Updated OrderItem if operation is successfull, null in case of any exception on server side).


### 6. Add orders (require Array of orders in json format in  request payload,Ex-{"customername: string,"orderAmount":int,"items: Array of OrderItems)
       Url- http://localhost:8080/addOrders (Http Method- Get)
       Response Payload- ("All orders saved successfully!" if operation is successfull, "Failed to save orders" in case of any exception on server side).




