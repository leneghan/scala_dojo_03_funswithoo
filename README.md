<div class="wiki-content" style="font-size: 10pt; line-height: 13pt;">
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">


Summary</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
This weeks dojo will delve into the other halve of Scala's dual personality, Object Orientation. We will be looking at how objects are created and operated on as well as discovering how Traits can help modularise your code and remove more duplication than Interfaces alone.</div>
<ul style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">Traits -&nbsp;<a class="external-link" href="http://www.scala-lang.org/node/126" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">http://www.scala-lang.org/node/126</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">Traits and types blog -&nbsp;<a class="external-link" href="http://www.codecommit.com/blog/scala/scala-for-java-refugees-part-5" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">http://www.codecommit.com/blog/scala/scala-for-java-refugees-part-5</a></li>
</ul>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">


<a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo03-funswithOO-FunswithObjectOrientation"></a>Funs with Object Orientation</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
This week you will find 6 tests that you will have to complete as well as then make them pass, though you will find a couple of helper methods that assert some of their functionality. Along with tests there is an Item object hierarchy, a User and a couple of Traits with only the method signatures implemented.&nbsp;<a class="external-link" href="https://github.com/leneghan/scala_dojoscala_dojo_03_funswithoo" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">The skeleton maven project I have created for the dojo can be found here on github</a>.</div>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">


<a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo03-funswithOO-SBT"></a>SBT</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
You will find that this project now builds with both Maven and SimpleBuildTool. SBT is incredabilly easy to to install and it is highly recommended you give it a try as it is the standard Scala build tool.</div>
<ul style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">SimpleBuildTool install steps -&nbsp;<a class="external-link" href="https://github.com/harrah/xsbt/wiki/Getting-Started-Setup" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/harrah/xsbt/wiki/Getting-Started-Setup</a></li>
</ul>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">


<a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo03-funswithOO-Gettingthecode"></a>Getting the code</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
To get started you can&nbsp;<a class="external-link" href="https://github.com/leneghan/scala_dojo_02_funswithlists" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">go to the repo</a>&nbsp;and fork the project into your own github repository by clicking the fork button on the top right. This is the preferred method as it means we can easily share our solutions with each other but if you don't wish to do this you can create a local copy from my repository by simply executing the git clone command.</div>
<ol style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">go to&nbsp;<a class="external-link" href="https://github.com/leneghan/scala_dojo_03_funswithoo" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/leneghan/scala_dojo_03_funswithoo</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">click fork button on the top right of the screen</li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><em>git clone&nbsp;<a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/</a>&lt;GIT_HUB_NAME&gt;/scala_dojo_03_funswithoo.git</em></li>
</ol>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
or</div>
<div class="preformatted panel" style="background-attachment: initial; background-clip: initial; background-color: white; background-image: initial; background-origin: initial; border-bottom-color: rgb(102, 153, 204); border-bottom-style: solid; border-bottom-width: 1px; border-left-color: rgb(102, 153, 204); border-left-style: solid; border-left-width: 1px; border-right-color: rgb(102, 153, 204); border-right-style: solid; border-right-width: 1px; border-top-color: rgb(102, 153, 204); border-top-style: solid; border-top-width: 1px; margin-bottom: 10px; margin-left: 20px; margin-right: 20px; margin-top: 10px; overflow-x: hidden; overflow-y: hidden; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
<div class="preformattedContent panelContent" style="background-attachment: initial; background-clip: initial; background-image: initial; background-origin: initial; font-size: 0.95em; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 12px; padding-left: 10px; padding-right: 10px; padding-top: 12px; text-align: left;">
<pre style="font-family: 'Courier New', Courier, monospace; line-height: 1.3; overflow-x: auto; overflow-y: auto; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">git clone https://github.com/leneghan/scala_dojo_03_funswithoo.git
</pre>
</div>
</div>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">


<a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo03-funswithOO-Gettingstartedwithgit"></a>Getting started with git</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
If you dont have git currently installed you can download it&nbsp;<a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">here from the git website</a>. When using Git I found this one page cheat sheet useful, it also comes with some pointers about good VCS practice,&nbsp;<a class="external-link" href="http://www.git-tower.com/files/cheatsheet/Git_Cheat_Sheet_grey.pdf" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git_Cheat_Sheet_grey.pdf</a></div>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">


<a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo03-funswithOO-Resources"></a>Resources</h4>
<ul style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="http://www.scalatest.org/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">ScalaTest website</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="http://twitter.github.com/scala_school/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Twitters Scala School</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">GitHub website</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git download location</a></li>
</ul>
</div>

</div>

