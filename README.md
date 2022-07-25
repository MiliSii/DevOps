# DevOps

Installed: Ubuntu OS from https://releases.ubuntu.com/22.04/, VMware Workstation from https://customerconnect.vmware.com/en/downloads/details?downloadGroup=WKST-PLAYER-1624&productId=1039&rPId=91446, Visual Studio Code. 

Groovy extensions for VSC: code-groovy, Groovy Lint, Format and Fix, Groovy and Code Runner.
Also, updated sistem and install java and updated groovy through terminal code from this link https://computingforgeeks.com/how-to-install-apache-groovy-on-ubuntu/ .

To access VSC:terminal -> code


Changing memory:
Player -> Manage -> Virtual Machine Stettings -> Memory -> Choose how much GB you need->OK


Process to Create Virtual Machine using VMware Workstation:
(From: https://kb.vmware.com/s/article/1018415#:~:text=To%20create%20a%20virtual%20machine%20using%20VMware%20Workstation%3A,An%20installer%20disc%20image%20file%20%28ISO%29%20See%20More.)

Launch VMware Workstation.
Click New Virtual Machine.
Select the type of virtual machine you want to create and click Next:

Custom: This gives you an option to create a virtual machine and choose its hardware compatibility. You can choose from Workstation 16.x, Workstation 15.x, Workstation 14.x .
Typical: This creates a virtual machine which has the same hardware version as the version of Workstation you are using. If you are using Workstation 16.x, it creates a virtual machine with hardware version 16. If you are using Workstation 15.x a virtual machine with hardware version 15 is created.
 
Click Next.
Select your guest operating system (OS), then click Next. You can install the OS using:
 
An installer disc (CD/DVD)
An installer disc image file (ISO)
 
Click Next.
Enter your Product Key.

Create a user name and password.

Click Next.

Enter a virtual machine name and specify a location for virtual machine files to be saved, click Next.
Establish the virtual machine's disk size, select whether to store the virtual disk as a single file or split the virtual disk into 2GB files, click Next.
Verify the other configuration settings for your virtual machine:
 
Memory – change the amount of memory allocated to the virtual machine.
Processors – change the number of processors, number of cores per processor, and the virtualization engine.
CD / DVD – with advanced settings where you can choose between SCSI, IDE.
Network adapter – configure it to bridge, NAT, or Host-only mode, or customize where you can choose between 0 to 9 adapters.
USB Controller.
Sound card.
Display – enable 3D graphics.
 
Click Finish.
When the virtual machine is powered on, the VMware Tools installation starts. You are prompted to restart your virtual machine once the Tools installation completes.


