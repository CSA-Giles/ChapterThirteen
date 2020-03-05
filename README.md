<hr>
<p>
------------------------------------------------------------------------<br>
This project is created to test the abilities of reading and writing data <br>
Into a .txt file to be stored for later use. Then, the stored data can be <br>
accessed at a later date from a separate class, as well as find a data set<br>
------------------------------------------------------------------------</p>

<h2>Chapter Thirteen / Lesson 1.2:</h2>
<hr>

# Chapter Thirteen
<li>PURPOSE OF PROJECT: To write and read InState and OutState Files                          </li>
<li>DATE: 03.05.2020                                                                          </li>
<li>HOW TO START THIS PROJECT: Run CreateFilesBasedOnState and follow the instructions it says</li>
<li>AUTHORS: Cole Giles                                                                       </li>
<li>USER INSTRUCTIONS:                                                                        </li>

<p>#5. Write out a paragraph on how the program is displaying text to the text file and another paragraph on how the program is reading from the text file. What is the method call that is making this happen?
            The CreateFilesBasedOnState writes data by first using the createEmptyFile method to create a blank space for the InState and OutState records to write into.
        Then, it asks the user to enter their info, where it will store the data to different variables. Next it concatenates all of the variables into one line,
        where it then writes into the text file. Finally, it asks if you want to enter more data, or it ends if the special code for QUIT is entered.</p>
            <p>The ReadStateFile, on the other hand, uses the BufferedReader to be able to actually read the lines of text that you just stored. It will then ask you to
        enter a certain file to access, where it will begin to search for data. Then, it uses a while statement to go through each line to see if the account number
        is empty or not, and will only print off any of the accounts that have been filled in. It will also take all of their balances and add them into a total.
        Finally, it will ask if you want to access a certain account, and pull up that record.</p>
<p>#6. What is a try catch statement and why do you need the catch exception?
        A try catch statement is made to execute code blocks while looking out for errors. The catch part is needed because otherwise there will be no way to show an error.</p>
<p>#7.  Screen shot of console showing OutOfState or InState customers read from file. Display account info - Total - and specific customer.</p>
<img src="InState.PNG">
<img src="OutState.PNG">

<hr>
<p>
------------------------------------------------------------------------<br>
This is the project README file. Here, you should describe your project.<br>
Tell the reader (someone who does not know anything about this project)<br>
all he/she needs to know. The comments should usually include at least:<br>
------------------------------------------------------------------------</p>

# Lesson Insert Number Here
<li>PURPOSE OF PROJECT:                              </li>
<li>VERSION or DATE:                                 </li>
<li>HOW TO START THIS PROJECT:                       </li>
<li>AUTHORS:                                         </li>
<li>USER INSTRUCTIONS:                               </li>

<p>#?  EXAMPLE Insert question you are answering here </p>
<p>#?  EXAMPLE Insert question you are answering here </p>
<p>#?  EXAMPLE Insert question you are answering here </p>
<hr>
<p>
