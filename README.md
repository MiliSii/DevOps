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
2. Install Jenkines 


**Day 4**
---

