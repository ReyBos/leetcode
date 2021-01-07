# LeetCode
<p>
    My profile on <a href="https://leetcode.com/ReyBos/">leetcode</a>
</p>
<h3>Used technologies:</h3>
<ul>
  <li>Open JDK 14 - compiler \ interpreter</li>
  <li>Maven - project management</li>
  <li>JUnit4 - testing</li>
</ul>
<h3>Project structure:</h3>
<pre>
<code>.
└ src
   ├─ main
   └─ test</code>
</pre>
<!--
 ├── main
 |   ├── index.js
 |   ├── product.js
 |   └── product.test.js
 └── test
 |   ├── index.js
 |   ├── user.js
 |   └── user.test.js</code>
 -->
<p>
    All tasks are in the "./src/main/java" folder, and tests are in the "./src/test/java" folder
</p>
<p>
    Each leetcode task is in its own package. The package name depends on the job name, for example, the "richest.customer.wealth" package is used for the "Richest Customer Wealth" job
</p>
<p>
    For convenience, links to solutions and tests are collected in the table below
</p>
<h3>How to install:</h3>
<p>
    First, you must have installed <a href="https://maven.apache.org/">Maven</a>
</p>
<p>
    Then you need to open a terminal in the folder where you are going to store the project.<br>
    Now we download files from the remote repository
</p>
<pre>
<code>$ git clone https://github.com/ReyBos/leetcode.git leetcode</code>
</pre>
<p>
    "https://github.com/ReyBos/leetcode.git" - repository address, if you forked this repository yourself, then the address will be different<br>
    "leetcode" - the name of the target folder
</p>
<p>
    <img src="screenshots/1.png" height="150">
</p>
<p>
    After successfully loading the data, you need to go to the project folder and collect it.
</p>
<pre>
<code>$ cd leetcode
$ mvn install</code>
</pre>
<p>
    <img src="screenshots/2.png" height="150">
</p>
<p>
    This completes the installation of the project, you can proceed to use.
</p>
<h3>How to use:</h3>
<p>
For every problem I solved, junit4 tests were written, you can use them to test your solutions. To do this, you need to find the task you are interested in in the table below and see in which package it lies. Or see the principle of forming a package for a task in the "Project structure" section. For example, the solution for a task named "Two sum" will be located at "src/main/java/two/sum/Solution.java"<br>
After you find the file you want, replace my code in it with yours.
</p>
<p>
    <img src="screenshots/3.png" height="200">
</p>
<p>
    Now you can run the tests, the algorithm may differ depending on which tool you use. 
I will consider two options: running tests in terminal and in IntelliJ IDEA
</p>
<h4>IntelliJ IDEA</h4>
<p>
Find a test with the same package as the solution and run it
</p>
<p>
    <img src="screenshots/4.png" height="200">
</p>
<p>
    As a result, you will receive either a message about the successful passing of the tests, or information about the failed tests
</p>
<p>
    <img src="screenshots/5.png" height="150">
</p>
<h4>Terminal</h4>
<p>
    To test through the terminal, you need to go to the project folder and execute the command to run the test
</p>
<pre>
<code>$ cd leetcode
$ mvn clean test -Dtest=your.package.TestClassName</code>
</pre>
<p>
Let's see what your.package.TestClassName is using the example of the "Two sum" task.<br>
The name of the package for this task will be "two.sum", so the test will be located at the address "src/test/java/two/sum", where we will find the name of the class for the test "SolutionTest". Then "your.package.TestClassName" for this task will be "two.sum.SolutionTest".<br>
Let's run this test.
</p>
<p>
    <img src="screenshots/6.png" height="150">
</p>
<p>
    If all tests are passed, we will receive a "BUILD SUCCESS" message, otherwise an error message and failed tests.
</p>
<p>
    <img src="screenshots/7.png" height="150">
</p>
<h3>So far resolved issues:</h3>
<table>
  <thead>
    <tr>
      <th align=center>
        <sub>#</sub>
      </th>
      <th align=center>
        <sub>Title</sub>
      </th>
      <th align=center>
        <sub>Solution</sub>
      </th>
      <th align=center>
        <sub>Difficulty</sub>
      </th>
      <th align=center>
        <sub>Runtime <br> faster than</sub>
      </th>
      <th align=center>
        <sub>Memory Usage <br> less than</sub>
      </th>
    </tr>
  </thead>
  <tbody>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/richest-customer-wealth/">1672</a>
        </td>
        <td>
          <sub>Richest Customer Wealth</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/running/richest/customer/wealth">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/running/richest/customer/wealth">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>38.6 MB <br> 61.35%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/">1689</a>
        </td>
        <td>
          <sub>Partitioning Into Minimum Number Of Deci-Binary Numbers</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/partitioning/into/minimum/number/of/deci/binary/numbers">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/partitioning/into/minimum/number/of/deci/binary/numbers">tests</a>
        </td>
        <td align=center>
          <sub>Medium</sub>
        </td>
        <td align=center>
          <sub>4 ms <br> 96.41%</sub>
        </td>
        <td align=center>
          <sub>39.9 MB <br> 51.56%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/running-sum-of-1d-array/">1480</a>
        </td>
        <td>
          <sub>Running Sum of 1d Array</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/running/sum/of/one/dimensional/array">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/running/sum/of/one/dimensional/array">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>39.1 MB <br> 72.55%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/subrectangle-queries/">1476</a>
        </td>
        <td>
          <sub>Subrectangle Queries</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/subrectangle/queries">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/subrectangle/queries">tests</a>
        </td>
        <td align=center>
          <sub>Medium</sub>
        </td>
        <td align=center>
          <sub>25 ms <br> 54.30%</sub>
        </td>
        <td align=center>
          <sub>42.8 MB <br> 70.32%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/shuffle-the-array/">1470</a>
        </td>
        <td>
          <sub>Shuffle the Array</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/shuffle/the/array">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/shuffle/the/array">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>39.1 MB <br> 75.92%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies">1431</a>
        </td>
        <td>
          <sub>Kids With the Greatest Number of Candies</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/kids/with/the/greatest/number/of/candies">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/kids/with/the/greatest/number/of/candies">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>39.3 MB <br> 33.00%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/defanging-an-ip-address">1108</a>
        </td>
        <td>
          <sub>Defanging an IP Address</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/defanging/an/ip/address">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/defanging/an/ip/address">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>36.9 MB <br> 78.00%</sub>
        </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/zigzag-conversion/solution/">0006</a>
      </td>
      <td>
        <sub>ZigZag Conversion</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/zig/zag/conversion">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/zig/zag/conversion">tests</a>
      </td>
      <td align=center>
        <sub>Medium</sub>
      </td>
      <td align=center>
        <sub>5 ms <br> 73.00%</sub>
      </td>
      <td align=center>
        <sub>39.7 MB <br> 50.41%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/longest-palindromic-substring/">0005</a>
      </td>
      <td>
        <sub>Longest Palindromic Substring</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/longest/palindromic/substring">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/longest/palindromic/substring">tests</a>
      </td>
      <td align=center>
        <sub>Medium</sub>
      </td>
      <td align=center>
        <sub>101 ms <br> 40.26%</sub>
      </td>
      <td align=center>
        <sub>39.5 MB <br> 46.51%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">0004</a>
      </td>
      <td>
        <sub>Median of Two Sorted Arrays</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/median/of/two/sorted/arrays">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/median/of/two/sorted/arrays">tests</a>
      </td>
      <td align=center>
        <sub>Hard</sub>
      </td>
      <td align=center>
        <sub>2 ms <br> 99.67%</sub>
      </td>
      <td align=center>
        <sub>39.9 MB <br> 90.79%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">0003</a>
      </td>
      <td>
        <sub>Longest Substring Without Repeating Characters</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/longest/substring/without/repeating/characters">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/longest/substring/without/repeating/characters">tests</a>
      </td>
      <td align=center>
        <sub>Medium</sub>
      </td>
      <td align=center>
        <sub>6 ms <br> 64.75%</sub>
      </td>
      <td align=center>
        <sub>39.3 MB <br> 42.28%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/add-two-numbers/">0002</a>
      </td>
      <td>
        <sub>Add Two Numbers</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/add/two/numbers">java</a> <br> 
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/add/two/numbers">tests</a>
      </td>
      <td align=center>
        <sub>Medium</sub>
      </td>
      <td align=center>
        <sub>2 ms <br> 77.18%</sub>
      </td>
      <td align=center>
        <sub>39.4 MB <br> 47.13%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/two-sum/">0001</a>
      </td>
      <td>
        <sub>Two Sum</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/blob/master/src/main/java/two/sum">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/blob/master/src/test/java/two/sum">tests</a>
      </td>
      <td align=center>
        <sub>Easy</sub>
      </td>
      <td align=center>
        <sub>0 ms <br> 100.00%</sub>
      </td>
      <td align=center>
        <sub>39.2 MB</sub> <br> <sub>55.89%</sub>
      </td>
    </tr>
  </tbody>
</table>