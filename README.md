
Exercise 8
==========

1. Start Tomcat and open Swagger UI page: http://localhost:8080/resources/index.html

2. Get to know the Swagger UI capabilities by doing the following:
 - Find the number of books in the library
 - Add a new book to the database
 - Confirm that the book is successfully added
 - Delete the book you added

3. See how an API code modification is automatically applied to the documentation:
 - Change Book delete operation from method **DELETE** to method **PATCH** in the **LibraryController** file
 - **Restart** Tomcat and see that the PATCH method is now shown instead of DELETE
 - **Switch back the operation to be as a DELETED method**

4. Enrich the API with the following:
 - Set a description to the books resource (i.e. "Library books resource")
 - Similarly to Book's title, set the author and catalog id fields as required
 - Set a description to the Book creation operation (i.e. "Add a new book to the library")
 - GET books by author operation - set a description to the query param (i.e. "The book author", hint: use value property)
 - DELETE operation - document that a 400 code response is returned when trying to delete a book with an invalid catalog id is requested (i.e. "The book catalog id is invalid")
 - **Restart** Tomcat and see that all of the above are reflected in Swagger UI
