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
For every problem I solved, junit4 tests were written, you can use them to test your solutions. To do this, you need to find the task you are interested in in the table below and see in which package it lies. Or see the principle of forming a package for a task in the "Project structure" section. For example, the solution to the problem "Two sum" will have the package "two.sum" and is located at "src/main/java/two/sum/Solution.java"<br>
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
          <a href="https://leetcode.com/problems/find-the-highest-altitude/">1732</a>
        </td>
        <td>
          <sub>Find the Highest Altitude</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/find/the/highest/altitude">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/find/the/highest/altitude">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>36.8 MB <br> 60.77%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/decode-xored-array/">1720</a>
        </td>
        <td>
          <sub>Decode XORed Array</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/decode/xored/array">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/decode/xored/array">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>1 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>40.5 MB <br> 74.49%</sub>
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
          <a href="https://leetcode.com/problems/count-of-matches-in-tournament/">1688</a>
        </td>
        <td>
          <sub>Count of Matches in Tournament</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/count/of/matches/in/tournament">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/count/of/matches/in/tournament">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>35.7 MB <br> 71.87%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/count-the-number-of-consistent-strings/">1684</a>
        </td>
        <td>
          <sub>Count the Number of Consistent Strings</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/count/the/number/of/consistent/strings">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/count/the/number/of/consistent/strings">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>13 ms <br> 40.83%</sub>
        </td>
        <td align=center>
          <sub>39.8 MB <br> 66.26%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/">1662</a>
        </td>
        <td>
          <sub>Check If Two String Arrays are Equivalent</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/check/two/string/arrays/are/equivalent">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/check/two/string/arrays/are/equivalent">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>1 ms <br> 73.79%</sub>
        </td>
        <td align=center>
          <sub>38.6 MB <br> 28.74%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/goal-parser-interpretation/">1678</a>
        </td>
        <td>
          <sub>Goal Parser Interpretation</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/goal/parser/interpretation">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/goal/parser/interpretation">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>37 MB <br> 94.88%</sub>
        </td>
    </tr>
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
          <a href="https://leetcode.com/problems/design-an-ordered-stream/">1656</a>
        </td>
        <td>
          <sub>Design an Ordered Stream</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/design/an/ordered/stream">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/design/an/ordered/stream">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>67 ms <br> 77.63%</sub>
        </td>
        <td align=center>
          <sub>40.2 MB <br> 89.55%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/">1637</a>
        </td>
        <td>
          <sub>Widest Vertical Area Between Two Points Containing No Points</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/widest/vertical/area/between/two/points/containing/no/points">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/widest/vertical/area/between/two/points/containing/no/points">tests</a>
        </td>
        <td align=center>
          <sub>Medium</sub>
        </td>
        <td align=center>
          <sub>17 ms <br> 70.35%</sub>
        </td>
        <td align=center>
          <sub>93.0 MB <br> 11.81%%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/">1614</a>
        </td>
        <td>
          <sub>Maximum Nesting Depth of the Parentheses</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/maximum/nesting/depth/of/the/parentheses">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/maximum/nesting/depth/of/the/parentheses">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>37.2 MB <br> 44.52%%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/design-parking-system/">1603</a>
        </td>
        <td>
          <sub>Design Parking System</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/design/parking/system">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/design/parking/system">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>6 ms <br> 99.77%</sub>
        </td>
        <td align=center>
          <sub>40.2 MB <br> 14.00%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/sum-of-all-odd-length-subarrays/">1588</a>
        </td>
        <td>
          <sub>Sum of All Odd Length Subarrays</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/sum/of/all/odd/length/subarrays">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/sum/of/all/odd/length/subarrays">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%%</sub>
        </td>
        <td align=center>
          <sub>36.5 MB <br> 84.79%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/count-good-triplets/">1534</a>
        </td>
        <td>
          <sub>Count Good Triplets</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/count/good/triplets">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/count/good/triplets">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>13 ms <br> 66.97%</sub>
        </td>
        <td align=center>
          <sub>36.4 MB <br> 82.37%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/shuffle-string/">1528</a>
        </td>
        <td>
          <sub>Shuffle String</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/shuffle/string">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/shuffle/string">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>1 ms <br> 99.95%</sub>
        </td>
        <td align=center>
          <sub>39 MB <br> 78.34%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/number-of-good-pairs/">1512</a>
        </td>
        <td>
          <sub>Number of Good Pairs</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/number/of/good/pairs">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/number/of/good/pairs">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>36 MB <br> 96.36%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/xor-operation-in-an-array/">1486</a>
        </td>
        <td>
          <sub>XOR Operation in an Array</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/xor/operation/in/an/array">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/xor/operation/in/an/array">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>35.9 MB <br> 40.00%</sub>
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
          <a href="https://leetcode.com/problems/create-target-array-in-the-given-order">1389</a>
        </td>
        <td>
          <sub>Create Target Array in the Given Order</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/create/target/array/in/the/given/order">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/create/target/array/in/the/given/order">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>37.5 MB <br> 60.36%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/design-a-stack-with-increment-operation/">1381</a>
        </td>
        <td>
          <sub>Design a Stack With Increment Operation</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/design/a/stack/with/increment/operation">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/design/a/stack/with/increment/operation">tests</a>
        </td>
        <td align=center>
          <sub>Medium</sub>
        </td>
        <td align=center>
          <sub>5 ms <br> 79.92%</sub>
        </td>
        <td align=center>
          <sub>39.8 MB <br> 63.77%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">1365</a>
        </td>
        <td>
          <sub>How Many Numbers Are Smaller Than the Current Number
</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/how/many/numbers/are/smaller/than/the/current/number">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/how/many/numbers/are/smaller/than/the/current/number">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>4 ms <br> 63.27%</sub>
        </td>
        <td align=center>
          <sub>38.9 MB <br> 84.35%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">1342</a>
        </td>
        <td>
          <sub>Number of Steps to Reduce a Number to Zero
</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/number/of/steps/to/reduce/a/number/to/zero">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/number/of/steps/to/reduce/a/number/to/zero">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>35.9 MB <br> 32.70%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/decompress-run-length-encoded-list/">1313</a>
        </td>
        <td>
          <sub>Decompress Run-Length Encoded List</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/decompress/run/length/encoded/list">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/decompress/run/length/encoded/list">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>2 ms <br> 48.15%</sub>
        </td>
        <td align=center>
          <sub>44.6 MB <br> 8.33%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/">1282</a>
        </td>
        <td>
          <sub>Group the People Given the Group Size They Belong To</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/group/the/people/given/the/group/size/they/belong/to">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/group/the/people/given/the/group/size/they/belong/to">tests</a>
        </td>
        <td align=center>
          <sub>Medium</sub>
        </td>
        <td align=center>
          <sub>5 ms <br> 68.11%</sub>
        </td>
        <td align=center>
          <sub>40.0 MB <br> 33.09%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">1281</a>
        </td>
        <td>
          <sub>Subtract the Product and Sum of Digits of an Integer</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/subtract/the/product/and/sum/of/digits/of/an/integer">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/subtract/the/product/and/sum/of/digits/of/an/integer">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>35.9 MB <br> 32.78%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/minimum-time-visiting-all-points/">1266</a>
        </td>
        <td>
          <sub>Minimum Time Visiting All Points</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/minimum/time/visiting/all/points">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/minimum/time/visiting/all/points">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>38.4 MB <br> 90.93%</sub>
        </td>
    </tr>
    <tr>
        <td align=center>
          <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/">1221</a>
        </td>
        <td>
          <sub>Split a String in Balanced Strings</sub>
        </td>
        <td align=center>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/split/a/string/in/balanced/strings">java</a> <br>
          <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/split/a/string/in/balanced/strings">tests</a>
        </td>
        <td align=center>
          <sub>Easy</sub>
        </td>
        <td align=center>
          <sub>0 ms <br> 100.00%</sub>
        </td>
        <td align=center>
          <sub>38.5 MB <br> 12.88%</sub>
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
        <a href="https://leetcode.com/problems/jewels-and-stones/">0771</a>
      </td>
      <td>
        <sub>Jewels and Stones</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/jewels/and/stones">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/jewels/and/stones">tests</a>
      </td>
      <td align=center>
        <sub>Easy</sub>
      </td>
      <td align=center>
        <sub>1 ms <br> 70.48%</sub>
      </td>
      <td align=center>
        <sub>37.3 MB <br> 65.20%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/to-lower-case/">0709</a>
      </td>
      <td>
        <sub>To Lower Case</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/to/lower">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/to/lower">tests</a>
      </td>
      <td align=center>
        <sub>Easy</sub>
      </td>
      <td align=center>
        <sub>0 ms <br> 100.00%</sub>
      </td>
      <td align=center>
        <sub>36.8 MB <br> 77.78%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/arranging-coins/">0441</a>
      </td>
      <td>
        <sub>Arranging Coins</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/arranging/coins">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/arranging/coins">tests</a>
      </td>
      <td align=center>
        <sub>Easy</sub>
      </td>
      <td align=center>
        <sub>6 ms <br> 47.28%</sub>
      </td>
      <td align=center>
        <sub>36.2 MB <br> 65.40%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/battleships-in-a-board/">0419</a>
      </td>
      <td>
        <sub>Battleships in a Board</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/battleships/in/a/board">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/battleships/in/a/board">tests</a>
      </td>
      <td align=center>
        <sub>Medium</sub>
      </td>
      <td align=center>
        <sub>0 ms <br> 100.00%</sub>
      </td>
      <td align=center>
        <sub>38.3 MB <br> 91.15%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/trapping-rain-water/">0042</a>
      </td>
      <td>
        <sub>Trapping Rain Water</sub>
      </td>
      <td align=center>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/main/java/trapping/rain/water">java</a> <br>
        <a href="https://github.com/ReyBos/leetcode/tree/master/src/test/java/trapping/rain/water">tests</a>
      </td>
      <td align=center>
        <sub>Hard</sub>
      </td>
      <td align=center>
        <sub>4 ms <br> 12.54%</sub>
      </td>
      <td align=center>
        <sub>40.0 MB <br> 11.96%</sub>
      </td>
    </tr>
    <tr>
      <td align=center>
        <a href="https://leetcode.com/problems/zigzag-conversion/">0006</a>
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