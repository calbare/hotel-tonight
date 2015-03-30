README
======
First, I must say, is that I have never tested mobile web before, nor have I used Appium.
I did evaluate RoboElectric, Robotium, Espresso and had working copies of these to show
the team at Arxan, but these were for native apps. However, I didn't try Appium. I just
ran out of time back then, and Espresso seemed the way to go since we didn't test mobile
web, not even hybrid apps. We protected android apk files, so mobile web testing wasn't
something we could use and Espresso seemed to be so much better for our purposes (and it
was fast).

Why am I using Appium for this QA exercise? Well, it looks like the web page that I was
given said to use Selenium WebDriver (http://www.seleniumhq.org/download/), and that the
exercise said that the links to test only worked on mobile web. I also wanted to use the
Android Emulator since it was relatively easy to setup. However, the documentation link
for AndroidDriver seemed to be empty. I got a 404 message when trying to access it:

  https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/android/AndroidDriver.html

I looked on Google’s web site for Selenium WebDriver, and it said to use Selendroid:
  https://code.google.com/p/selenium/wiki/AndroidDriver
It gave old instructions for using an older Selenium. Anyways, it looks like Selenium WebDriver
is being used by Appium, so that’s what this exercise is trying to use, and all indications
show that Selenium WebDriver is used with Appium.

For the Android emulator, I’m using a Nexus 5 (arm, android 4.4).

It looks like the two most useful sites (so far) are:

http://blogs.technet.com/b/antino/archive/2014/09.aspx
This blog gives a good explanation of Appium. However, it uses C# and she mentions that
you can’t use it for testing mobile web. But this seems to be outdated since Appium
specifically mentions that you can use it to test mobile web right on the appium.io home
page.

The next most useful web site is:
https://www.youtube.com/watch?v=cwZrKSGdvrA
This is a youtube video which shows you step-by-step how to setup Appium, but with a few
steps missing. It would be great if it had the code for what he used. Also, there is a
part where he shows testing mobile web, but using Selendroid. This is where code.google said
to use selendroid, but I heard that was only for older versions of Android. Now I’m not sure
if that’s what I should have followed?

This web site seems like it might have some useful information, but it costs $75:
https://www.udemy.com/mobile-automation-using-appiumselenium-3/
Plus, it’s 20 hours long for all the lessons.

One of the least useful sites seems to be for http://appium.io itself. It was difficult to
find useful information for what I was trying to do.

Anyways, I’ve been installing software, looking at documentation, looking at videos, and
setting up Intellij (at least twice), getting an android emulator to run, and I don’t have
much to show for the time I spent on this, this weekend.

If I had more time, I would try to learn:

1) how to test a straight web page/site.
   - this seems to be something I would need to learn even before testing a mobile web page.
   - this is a weakness in my test repertoire, at least for the job in question.
2) learn (or pay $75) for how to use appium/selenium better.
   - there seems to be a learning curve for this that I wasn’t able to get through enough
     during the weekend. I spent the better parts of Saturday and Sunday (when not going
     outdoors) for grocery shopping, etc.
3) I don’t think the obstacles are insurmountable, it will just take more time to research
   and find out the above information. If I used selenium before, it may not have taken so
   much time, but I was completely new to this type of testing (web, mobile web).

Anyways, I’ll check-in what I have on github, and send you a link for what I’ve got, including
this README.txt file.
