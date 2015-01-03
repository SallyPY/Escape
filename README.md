Escape
======

<h2>Introduction</h2>

<p>A room escape game is what it sounds like: a game where a user must get out of a locked room, usually through solving a progression of puzzles. <a href="http://neutralxe.net/esc/sphere_play.html">This</a> is a good example.</p>

<p>My game is a simple Java room escape game using Eclipse, and it acts as the final assignment for my Fall 2014 Intro to Computer Science class. </p>

<p>Development relied on the Swing GUI. Gimp 2 was used to create the graphics.</p>


<hr>
<h2>Running the zip file with Eclipse</h2>
<div>
  <ol>
    <li>Download and unzip the file.</li>
    <li>In Eclipse, File->Import->General->Import Existing Projects Into Workspace. Browse for my file in the root directory section. You might have to change the JRE System Library to one compatible with mine. I used JavaSE 1.8.</li>
    <li>Do this by right-clicking the Escape folder, Properties ->Libraries</li>
    <li>Remove the current library by selecting it and clicking Remove Library. Add a compatible library.</li>
    <li>On the main toolbar, Run.</li>
  </ol>
</div>

<hr>

<h2>Walkthrough*</h2>

<p>1st wall:</p>
  <ul>
	  <li>Collect bowl from under the couch.</li>
    <li> Click on the couch cushion. Collect the circular key.</li>
  </ul>
<p>2nd wall</p>
  <ul>
    <li>Place circular key into the safe. </li>
    <li>Note the flowers and the order of colors.</li>
  </ul>
<p>3rd wall</p>
  <ul>
    <li>Collect the crowbar.</li>
    <li>Click on the lever/switch. Go around the walls. Note where the red light hits.</li>
    <li>Fill the bowl with water.</li>
  </ul>
<p>4th wall</p>
  <ul>
    <li>Use the crowbar on the area where the red light hit to reveal a hole.</li>
    <li>Use the colors of the flowers from wall 2 to get the right combination of colors on this wall: pink, purple, purple. Pick up the seeds.</li>
    <li>Place the bowl with water into the hole.</li>
    <li>Place the seeds into the hole.</li>
    <li>Retrieve the key.</li>
    <li>Go to wall 1 and use the key on the door.</li>
  </ul>
<p>*These instructions don’t have an exact order, but especially towards the end you can’t complete steps without doing others first.</p>

<hr>

<h2>Limitations</p>

<p>I couldn’t incorporate all the features I wanted due to limitations in my programming ability and time. These include zooming in on a specific wall or item being able to view a selected item up close, and having more complex, realistic puzzles. </p>

<p>Regarding my limitation on puzzles, I don’t think the way I structured my flower puzzle was well-done. I had a hard time figuring out a way to check if all the right flowers were clicked, and there seems to be a lot of code for such a small part of the game. I didn’t even attempt trying to incorporate a numberpad lock, which many room escape games seem to have.</p>

<p>The most difficult part was handling the classes in the image package. The ImageSpacePanel, ImageLabel, and ImagePanel classes allowed for the collection of items around the room and the interaction between the inventory and wall. However, the code for this is convoluted and not as straightforward/readable as I feel it should be. And with this code, I couldn’t find a clean way to click on a collected item and view it up close.</p>
<hr>

<h2>Conclusion</h2>

<p>Overall, my game meets my expectations as a room escape game. Although the drawings aren’t ready for mass distribution, I enjoyed creating them and also surprisingly like them.  These games usually have sound effects, which I think for my project adds to the room escape atmosphere. I’m satisfied with how I handled the mouse clicks in different regions and how I got the arrow panels on either side of the walls to switch wall panels.</p>

<hr>

<h2> Notes on Progress </h2>

<p>The code is at the hands of a beginner and a new user to GitHub, so there will be problems on the way.</p>
<hr>

<b>11/15</b><br>
Having issues navigating GitHub. I will need to do more research. There is trouble with committing, branching, syncing, etc.

<b>11/22</b><br>
Removed metadata folder with a .gitignore file

<b>12/1</b><br>
Got a lot done over Thanksgiving break. You can actually win the game!


<b>12/4</b><br>
Had a problem with exporting images into a JAR file. Finally fixed. Now for sound effects.


<b>12/6-12/8</b><br>
Sound added.


<b>12/29</b><br>
I think this is the end. It has been a good run.

<b>1/2</b><br>
README edited to be more readable.

