### simple-servlet
<details> 
<summary>Description</summary>
  
- [X] Write simple Java Web App with one servlet and one JSP page. JSP should has AJAX call buttons (or forms if you feel better with forms) with names GET, POST, PUT, DELETE. Servlet should handle these requests and change its own state (inner state can be presented as a large collection of String objects).

- [X] JSP should display inner state of servlet (optional).

- [X] Don’t forget README (with deploy instructions for Tomcat) and web.xml

- [X] Use Maven to build that project.

- [X] Use cookies to track amount of JSP views.

- [ ] Add JSTL support and use fmt functions to present data.

- [ ] Use Rest-Assured framework to write a few tests for servlet.
</details>
<details> 
<summary>Tomcat deployment</summary>

File `pom.xml` contains lines that pull `tomcat7-maven plugin`. Let's make use of it: create a new Maven *Run/Debug Configuration*, name it whatever you want, put **tomcat7:run** in Command line field, and, finally, add a **Maven goal clean** to the list of things to do before launch:

![Run/Debug Configuration](https://i.imgur.com/hSoUSwU.png)

![Add maven configuration](https://i.imgur.com/WVSWmGj.png)

![Name, put tomcat7:run in Command line](https://i.imgur.com/lKy0srO.png)

![Add a Maven goal clean to the list of things](https://i.imgur.com/Y9GZyiX.png)

![Save](https://i.imgur.com/jgVsXLa.png)

**Run (Shift + F10)**    
`pom.xml` contains url and port: *http://localhost:8888/*
</details>

---

### horse-race-xml
<details> 
<summary>Description</summary>
Implement horse race emulator using XML configuration

Required beans:
+ `RaceService` for simple getRace() method which generates and returns information about the upcoming race
+ `EmulationService` for real-time race emulation (it generates data about horses positions on the console for every second)

Main domain objects: `Horse`, `Race`, `Rider`, `Breed`.

Add client code:
- On start-up application shows the information about upcoming race.
- User is offered to choose his horse (make a bet) with searching by name, breed, rider’s name
- After that a race emulation starts
- Winner announcement is displayed

(Nothing super-fancy in UI, just console application)
</details>

---

### horse-race-annotation
<details> 
<summary>Description</summary>
Move configuration from XML to Java based and annotation-based approach
</details>

---

### spring-core-bean-configuration
<details> 
<summary>Description</summary>
Create Spring console app. Use XML as configuration format.
  
- Create bean A, use DI via setters, use property placeholder for values
  
- Create bean B, use DI via constructor (bean A as argument of constructor)

- Create bean C with singleton scope and bean D with prototype scope. We need to add bean D as property of bean C. Pay attention that they have different scopes. Consider Lookup Method Injection.

- Create bean E and replace logic of one of his method by Method Replacement

- Create bean F and log all possible steps from his lifecycle (lifecycle of Spring bean).
</details>

---
