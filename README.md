### Task 1
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
