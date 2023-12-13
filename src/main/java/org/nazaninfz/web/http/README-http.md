# HTTP
- The HTTP is __application-level protocol__ for collaborative, distributed, hypermedia information systems.
- HTTP is __TCP/IP__ based communication protocol.
- HTTp default port is TCP 80.
- It allows web servers and browsers to exchange data over the web.
- It is a request response protocol.
- It uses the __reliable TCP__ connections by default on TCP __port 80__.
- It is __stateless__ default, means each request is considered as the new request. In other words, server doesn't recognize the user by default.

### Three fundamental powerful features of HTTP:

1. HTTP is __media independent__: It specifies that any type of media content can be sent by HTTP as long as both the server and the client can handle the data content.
2. HTTP is __connectionless__: It is a connectionless approach in which HTTP client i.e., a browser initiates the HTTP request and after the request is sent the client disconnects from server and waits for the response.
3. HTTP is __stateless__: The client and server are aware of each other during a current request only. Afterwards, both of them forget each other. Due to the stateless nature of protocol, neither the client nor the server can retain the information about different request across the web pages.

## HTTP Request
It contains:
1. The Request-line
2. The analysis of source IP address, proxy and port
3. The analysis of destination IP address, protocol, port and host
4. The Requested URI (Uniform Resource Identifier)
5. The Request method and Content
6. The User-Agent header
7. The Connection control header
8. The Cache control header

### HTTP Request Methods
1. __GET__: Aiming to retrieve the essential elements such as HTML, CSS, JavaScript, and other assets.
2. __HEAD__: It uses for tasks like resource existence verification, metadata retrieval, or examination of the resource’s modification date, all without the need to download the actual content.

#### __GET__ vs __POST__
1. __Visibility__: When using GET, data parameters are included in the URL and visible to everyone. However, when using POST, data is not displayed in the URL but in the HTTP message body.
2. __Security__: GET is less secure because the URL contains part of the data sent. On the other hand, POST is safer because the parameters are not stored in web server logs or the browser history.
3. __Cache__: GET requests can be cached and remain in the browser history, while POST requests cannot. This means GET requests can be bookmarked, shared, and revisited, while POST requests cannot.
4. __Server State__: GET just retrieves data but POST modifies or inserts data.
5. __Data Limitation__: The GET method is limited to a maximum number of characters, while the POST method has no such limitation. This is because the GET method sends data through the resource URL, which is limited in length, while the POST method sends data through the HTTP message body, which has no such limitation.
6. __Data Type__: The GET method supports only string data types, while the POST method supports different data types such as string, numeric, binary, and so on.
7. __Idempotent__: Get request is idempotent . It means second request will be ignored until response of first request is delivered. POST is non-idempotent.
8. __Efficient__: Get request is more efficient and used more than Post.