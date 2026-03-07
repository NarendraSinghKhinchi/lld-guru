* Proxy is a structural design pattern that provides an object that acts as a substitute for a real service object used by a client. A proxy receives client requests, does some work ( access control, caching etc.) and then passes the request to a service object.

### Identification
- Proxies delegate all of the real work to some other object. Each proxy method should, in the end, refer to a service object unless the proxy is a subclass of a service.

### Caching Proxy
In this example the proxy pattern helps to implement the lazy initialization and caching to an inefficient 3rd party youtube integration library.
Proxy is invaluable when you have to add some additional behaviours to a class which code you can't change.