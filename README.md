# RandomPause

Random Thread pause utility to avoid looking like a robot when crawling sites.


See Javadoc for more information.



<h3>Constructor Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Constructor Summary table, listing constructors, and an explanation">
<caption><span>Constructors</span><span class="tabEnd">&nbsp;</span></caption>
<tbody><tr>
<th class="colOne" scope="col">Constructor and Description</th>
</tr>
<tr class="altColor">
<td class="colOne"><code><span class="memberNameLink"><a href="RandomPause.html#RandomPause--">pause.RandomPause</a></span>()</code>&nbsp;</td>
</tr>
</tbody></table>

<!-- ========== METHOD SUMMARY =========== -->

<h3>Method Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Method Summary table, listing methods, and an explanation">
<tbody><tr>
<th class="colFirst" scope="col">Modifier and Type</th>
<th class="colLast" scope="col">Method and Description</th>
</tr>
<tr id="i0" class="altColor">
<td class="colFirst"><code>static int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="RandomPause.html#getMaxMillis--">getMaxMillis</a></span>()</code>
<div class="block">Returns currently set maximum milliseconds</div>
</td>
</tr>
<tr id="i1" class="rowColor">
<td class="colFirst"><code>static int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="RandomPause.html#getMinMillis--">getMinMillis</a></span>()</code>
<div class="block">Returns currently set minimum milliseconds</div>
</td>
</tr>
<tr id="i2" class="altColor">
<td class="colFirst"><code>static int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="RandomPause.html#pause--">pause</a></span>()</code>
<div class="block">Pauses the thread for a random amount of milliseconds between MIN_MILLIS and MAX_MILLIS</div>
</td>
</tr>
<tr id="i3" class="rowColor">
<td class="colFirst"><code>static int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="RandomPause.html#pause-int-">pause</a></span>(int&nbsp;refmillis)</code>
<div class="block">Pauses the thread for a random amount of milliseconds between 0 and refmillis*2</div>
</td>
</tr>
<tr id="i4" class="altColor">
<td class="colFirst"><code>static int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="RandomPause.html#pause-int-int-">pause</a></span>(int&nbsp;min,
     int&nbsp;max)</code>
<div class="block">Pauses the thread for a random amount of milliseconds between min and max values</div>
</td>
</tr>
<tr id="i5" class="rowColor">
<td class="colFirst"><code>static void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="RandomPause.html#setMaxMillis-int-">setMaxMillis</a></span>(int&nbsp;maxMillis)</code>
<div class="block">Sets maximum milliseconds value</div>
</td>
</tr>
<tr id="i6" class="altColor">
<td class="colFirst"><code>static void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="RandomPause.html#setMinMillis-int-">setMinMillis</a></span>(int&nbsp;minMillis)</code>
<div class="block">Sets minimum milliseconds value</div>
</td>
</tr>
</tbody></table>

<h3>Methods inherited from class&nbsp;java.lang.Object</h3>
<code>clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait</code>

<h3>Constructor Detail</h3>
<a name="RandomPause--"></a>
<h4>pause.RandomPause</h4>
<pre>public&nbsp;pause.RandomPause()</pre>

<h3>Method Detail</h3>
<a name="pause--"></a>
<ul class="blockList">
<li class="blockList">
<h4>pause</h4>
<pre>public static&nbsp;int&nbsp;pause()
                 throws java.lang.InterruptedException</pre>
<div class="block">Pauses the thread for a random amount of milliseconds between MIN_MILLIS and MAX_MILLIS</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>milliseconds paused</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.lang.InterruptedException</code></dd>
</dl>
</li>
</ul>
<a name="pause-int-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>pause</h4>
<pre>public static&nbsp;int&nbsp;pause(int&nbsp;min,
                        int&nbsp;max)
                 throws java.lang.InterruptedException</pre>
<div class="block">Pauses the thread for a random amount of milliseconds between min and max values</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>max</code> - Maximum amount of milliseconds to pause</dd>
<dd><code>min</code> - Minimum amount of milliseconds paused</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>milliseconds paused</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.lang.InterruptedException</code></dd>
</dl>
</li>
</ul>
<a name="pause-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>pause</h4>
<pre>public static&nbsp;int&nbsp;pause(int&nbsp;refmillis)
                 throws java.lang.InterruptedException</pre>
<div class="block">Pauses the thread for a random amount of milliseconds between 0 and refmillis*2</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>refmillis</code> - reference milliseconds</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>milliseconds paused</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.lang.InterruptedException</code></dd>
</dl>
</li>
</ul>
<a name="getMinMillis--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getMinMillis</h4>
<pre>public static&nbsp;int&nbsp;getMinMillis()</pre>
<div class="block">Returns currently set minimum milliseconds</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
</dl>
</li>
</ul>
<a name="setMinMillis-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setMinMillis</h4>
<pre>public static&nbsp;void&nbsp;setMinMillis(int&nbsp;minMillis)</pre>
<div class="block">Sets minimum milliseconds value</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>minMillis</code> - </dd>
</dl>
</li>
</ul>
<a name="getMaxMillis--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getMaxMillis</h4>
<pre>public static&nbsp;int&nbsp;getMaxMillis()</pre>
<div class="block">Returns currently set maximum milliseconds</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
</dl>
</li>
</ul>
<a name="setMaxMillis-int-">
<!--   -->
</a>
<ul class="blockListLast">
<li class="blockList">
<h4>setMaxMillis</h4>
<pre>public static&nbsp;void&nbsp;setMaxMillis(int&nbsp;maxMillis)</pre>
<div class="block">Sets maximum milliseconds value</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>maxMillis</code> - </dd>
</dl>
</li>
</ul>
</li>
</ul>
</li>
</ul>
</div>



