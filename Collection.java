/*
 *Create classes for the below objects with the fields specified below.
 Create three different instances for each type and add them to a collection.
 Now, read from these collection and print each attribute in console.

 Laptop : company, model, operatingSystem, processor
 Car : make, model, year, price
 Television : company, type (LCD, LED, Plasma), 3D enabled, price
 CellPhone : company, model, description, operatingSstem, price
 School : name, city, school district, greatSchoolRanking

 */

//Observe that Set doesn�t accept duplicate objects by writing an ddisplaying the elements in collection.
//For each above object, override equals() and hashCode() methods and define the equality. 
//Please see the criteria below. Create few equal objects (based on the below criteria) 
//and add them to HashSet and observe the fact that Set doesn�t accept duplicates (through equals() and hashCode()).
//
//
//Company and model  together define the equality for Laptop. 
//If two laptops have same company and model then they are equal.
//Car : make and model together define equality
//Television : company, type (LCD, LED, Plasma) and price together define equality
//CellPhone : company, model and operatingSstem together define equality
//School : name, city and school district together define equality
//
//
//Add all the names of our class students randomly to a collection, iterate through them and print.
//Observe that collection is maintaining the order that you add.
//
//
//Add all the names of our class students randomly to a collection, iterate through them and print. 
//Observe that collection keeps these elements in a natural order.
//
//
//Create few instances of Car and add them to a collection. Have Car implements Comparable interface and override
//compareTo() to order them by ascending order of make of the Car. Observe the fact that you need to provide the 
//order criteria in compareTo().
//
//
//Create a simple map to store all of our class students� names and their favorite fruits. Try to get their favorite fruit by giving their name. Also, list all the names and their favorite fruits saperately.
//
//

public class Collection {

}
