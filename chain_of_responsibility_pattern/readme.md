### Identification
- The pattern is recognized by behavioral methods of one group of objects that indirectly call the same methods in other objects, while all the objects follow the common interface.


#### Filtering access
- This example shows how a request containing user data passes a sequential chain of handlers that perform various things such as authentication, authorization, and validataion.
- we execute every handler until there's one that can't handle a request.