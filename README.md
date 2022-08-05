# DevOps

All .groove files have code with comments explaining the code. 

**Day 1:**
---
new.groovy files

Installed: Ubuntu OS from https://releases.ubuntu.com/22.04/, VMware Workstation from https://customerconnect.vmware.com/en/downloads/details?downloadGroup=WKST-PLAYER-1624&productId=1039&rPId=91446, Visual Studio Code. 

Groovy extensions for VSC: code-groovy, Groovy Lint, Format and Fix, Groovy and Code Runner.
Also, updated sistem and install java and updated groovy through terminal code from this link https://computingforgeeks.com/how-to-install-apache-groovy-on-ubuntu/ .

To access VSC:terminal -> code


Changing memory:
Player -> Manage -> Virtual Machine Stettings -> Memory -> Choose how much GB you need->OK


Process to Create Virtual Machine using VMware Workstation:
(From: https://kb.vmware.com/s/article/1018415#:~:text=To%20create%20a%20virtual%20machine%20using%20VMware%20Workstation%3A,An%20installer%20disc%20image%20file%20%28ISO%29%20See%20More.)

 1. Launch VMware Workstation.
   
 2. Click New Virtual Machine.
   
 3. Select the type of virtual machine you want to create and click Next:

      - Custom: This gives you an option to create a virtual machine and choose its hardware compatibility. You can choose from Workstation 16.x, Workstation 15.x, Workstation 14.x .

      - Typical: This creates a virtual machine which has the same hardware version as the version of Workstation you are using. If you are using Workstation 16.x, it creates a virtual machine with hardware version 16. If you are using Workstation 15.x a virtual machine with hardware version 15 is created.
 
 4. Click Next.

 5. Select your guest operating system (OS), then click Next. You can install the OS using:
 
       - An installer disc (CD/DVD)
       - An installer disc image file (ISO)
 
 6. Click Next.

 7. Enter your Product Key.

 8. Create a user name and password.

 9. Click Next.

10. Enter a virtual machine name and specify a location for virtual machine files to be saved, click Next.

11. Establish the virtual machine's disk size, select whether to store the virtual disk as a single file or split the virtual disk into 2GB files, click Next.
   
12. Verify the other configuration settings for your virtual machine:
 
       - Memory – change the amount of memory allocated to the virtual machine.

       - Processors – change the number of processors, number of cores per processor, and the virtualization engine.

       - CD / DVD – with advanced settings where you can choose between SCSI, IDE.

       - Network adapter – configure it to bridge, NAT, or Host-only mode, or customize where you can choose between 0 to 9 adapters.

       - USB Controller.

       - Sound card.

       - Display – enable 3D graphics.
 
13. Click Finish.

When the virtual machine is powered on, the VMware Tools installation starts. You are prompted to restart your virtual machine once the Tools installation completes.

**Day 2:**
---
nullSafeOperator.groovy, regularExpresion.groovy, and ternaryOperator.groovy files

**Regular expression: **

A regular expression is a pattern that is used to find substrings in text. Groovy supports regular expressions natively using the ~”regex” expression. The text enclosed within the quotations represent the expression for comparison.

**FOR BUILD REGEX **

1. Character classes:
2. .	any character except newline
3. \w\d\s	word, digit, whitespace
4. \W\D\S	not word, digit, whitespace
5. [abc]	any of a, b, or c
6. [^abc]	not a, b, or c
7. [a-g]	character between a & g

**Anchors:**

1. ^abc$	start / end of the string
2.  \b\B	word, not-word boundary

**Escaped characters**

1. \.\*\\	escaped special characters
2. \t\n\r	tab, linefeed, carriage return

**Groups & Lookaround:**

1. (abc)	capture group
2. \1	backreference to group #1
3. (?:abc)	non-capturing group
4. (?=abc)	positive lookahead
5. (?!abc)	negative lookahead

**Quantifiers & Alternation:**

1. a*a+a?	0 or more, 1 or more, 0 or 1
2. a{5}a{2,}	exactly five, two or more
3. a{1,3}	between one & three
4. a+?a{2,}?	match as few as possible
5. ab|cd	match ab or cd

**Links used for learning null safe operator, ternary operator, regular expressions:** https://riptutorial.com/groovy/example/18073/basic-usage,

https://giri-tech.blogspot.com/2018/10/navigate-safely-with-null-safe-operator.html,  

https://docs.oracle.com/en/cloud/saas/applications-common/22a/cgsac/understanding-groovys-null-safe-comparison-operators.html#u30004087,

https://compoundthinking.wordpress.com/2012/06/04/how-to-validate-email-address-with-regular-expression-in-groovy/,

https://www.danvega.dev/blog/2013/08/20/groovys-null-safe-operator/,

https://regexr.com/, 

https://www.tutorialspoint.com/groovy/groovy_regular_expressions.htm#:~:text=A%20regular%20expression%20is%20a%20pattern%20that%20is,within%20the%20quotations%20represent%20the%20expression%20for%20comparison.,

https://giri-tech.blogspot.com/2018/10/navigate-safely-with-null-safe-operator.html .

**Day 3:** 
---
1. I created VM on Azure portal
2. Installed Jenkines 

Commands to generate SSH key and open SSH file in VSC: 

1. cd ~/.ssh
2. ssh-keygen
3. code id_rsa.pub
    
Commands for installing Jenkins:


- Tutorial for creating VM on Azure : https://www.youtube.com/watch?v=QOv_-xBXkpo 
- Tutorial for installing Jenkins: https://www.youtube.com/watch?v=F_1AmlzP06U 

**Day 4**
---
Created jobs on Jenkins:
DeclerativePipeline, JobParametrized, Maven, parallel_execution, scriptedP, test and test_Job.

Go on url: http://20.224.149.71:8080/ => terminal VM in VMVare, comand sudo cat /var//lib/jenkins/secrets/initalAdminPassword, copy result => paste password in jenkins => Install Suggested plugins=> Create First Admin User => Save and Continue => Save and Finish => Finish

Diferent types of Jenkins job:
1. Freestyle Project
2. Pipeline
3. Multiconfiguration Projects
4. Folder
5. GitHub organization
6. Mutlibranch Pipeline

**Jenkins Pipeline** is a stack of Jenkins plugins and other tools which helps implementing and continuous integration and delivery pipelines. In Jenkins, Pipelines are written in DSL code which implements this continuous integration and delivery pipeline jobs.

Get the pipeline plugin from the Jenkins plugin market place and install into the Jenkins instance. For the same, Go to Manage Jenkins > Manage Plugins. > Available tab, search for “build pipeline”.

There are two type of Jenkins pipeline based on which format the Jenkinsfile is written.

1. Declarative pipeline
2. Scripted pipeline

**Declarative Pipeline**
The Declarative pipeline is a new feature that is added to create the pipeline. This is basically written in a Jenkinsfile which can be stored into a source code management system such as Git. Declarative pipelines is an ideal solution for the simple continuous delivery pipeline as it has very limited and pre-defined structure.

The structure and syntax of the Declarative pipeline:

- any – Which mean the whole pipeline will run on any available agent.
- none – Which mean all the stages under the block will have to declared with agent separately.
- label –  this is just a label for the Jenkins environment
- docker –  this is to run the pipeline in Docker environment.

**Scripted Pipeline**
The scripted pipeline is a traditional way of writing the Jenkins pipeline as code. Ideally, Scripted pipeline is written in Jenkins file on web UI of Jenkins. Unlike Declarative pipeline, the scripted pipeline strictly uses groovy based syntax. Since this, The scripted pipeline provides huge control over the script and can manipulate the flow of script extensively. This helps developers to develop advance and complex pipeline as code.

The structure and syntax of the scripted pipeline

Node Block:
Node is the part of the Jenkins architecture where Node or agent node will run the part of the workload of the jobs and master node will handle the configuration of the job. 

Stage Block:
Stage block can be a single stage or multiple as the task goes. And it may have common stages like

- Cloning the code from SCM
- Building the project
- Running the Unit Test cases
- Deploying the code
- Other functional and performance tests.

A **Jenkins agent** is an executable, residing on a node, that is tasked by the controller to run a job.

Managing the different Jenkins agents is the job of the agent controller, also known as the master node. In a single Jenkins node configuration, the controller, can also act as both a Jenkin agent and run build jobs.

Jenkins agent:
https://www.jenkins.io/doc/book/using/using-agents/, 

https://adamtheautomator.com/jenkins-agent/#:~:text=A%20Jenkins%20agent%20is%20an%20executable%2C%20residing%20on,both%20a%20Jenkin%20agent%20and%20run%20build%20jobs.


for opening jenkins https://www.youtube.com/watch?v=F_1AmlzP06U

for installing maven lugin https://huongdanjava.com/install-maven-integration-plugin-in-jenkins.html#:~:text=Just%20like%20Install%20Git%20plugin%20in%20Jenkins%2C%20first,now%20and%20install%20after%20restart%20to%20install%20it.

for scripted and notscripted papelines https://www.theserverside.com/answer/Declarative-vs-scripted-pipelines-Whats-the-difference#:~:text=Declarative%20pipelines%20always%20begin%20with%20the%20word%20pipeline.,into%20individual%20stages%20that%20can%20contain%20multiple%20steps.

for declarative pipleline https://digitalvarys.com/jenkins-declarative-pipeline-with-examples/
https://digitalvarys.com/jenkins-pipeline/#:~:text=Unlike%20Declarative%20pipeline%2C%20the%20scripted%20pipeline%20strictly%20uses,to%20develop%20advance%20and%20complex%20pipeline%20as%20code.

**Day 5**
---
- Job with parameters
- installed Docker (command docker run hello-world not working, but sudo docker run hello-world works )


**Docker Images vs Containers**
When discussing the difference between images and containers, it isn’t fair to contrast them as opposing entities. Both elements are closely related and are part of a system defined by the Docker platform.



Images can exist without containers, whereas a container needs to run an image to exist. Therefore, containers are dependent on images and use them to construct a run-time environment and run an application.

The two concepts exist as essential components (or rather phases) in the process of running a Docker container. Having a running container is the final “phase” of that process, indicating it is dependent on previous steps and components. That is why docker images essentially govern and shape containers.

A **Docker registry** is a system for storing and distributing Docker images with specific names. There may be several versions of the same image, each with its own set of tags. A Docker registry is separated into Docker repositories, each of which holds all image modifications. The registry may be used by Docker users to fetch images locally and to push new images to the registry (given adequate access permissions when applicable). The registry is a server-side application that stores and distributes Docker images. It is stateless and extremely scalable. 



building parameters: https://www.theserverside.com/video/Modify-CI-jobs-with-this-Jenkins-parameterized-build-example

command for installing docker: https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-20-04


command for creating a simple docker image (some of this commmands need to have sudo in front of them): https://phoenixnap.com/kb/create-docker-images-with-dockerfile#:~:text=1%20As%20an%20example%2C%20we%20will%20create%20a,with%20a%20text%20editor%20of%20your%20choice.%20

docker registry: https://www.geeksforgeeks.org/what-is-docker-registry/

commands for pushing image into repository: https://www.geeksforgeeks.org/how-to-push-a-container-image-to-a-docker-repository/ and https://www.youtube.com/watch?v=3SYJQ-z4LBw 



(for README.md https://www.markdownguide.org/cheat-sheet)

**Day 6**
---
**Day 7**
---
**Day 8**
---
**Day 9**
---
**Day 10**
---
