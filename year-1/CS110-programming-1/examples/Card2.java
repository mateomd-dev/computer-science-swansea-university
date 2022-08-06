/* This our second attempt at writing a card class.
 *
 * Notice that the class TestCard1 had the keyword 'public', and the class Card1 didn't. Why?
 * 
 * There are four possible things we can put in front of 'class' - including nothing;
 * 1. public - classes that are public are 'visible' everywhere. That is, if you write a public class code
 * in any other class can access it. However, it also has to be in a file with the same name. That is why
 * all the code you've written so far has been in a file with the same name as the class. It's also why the Card1
 * example was in a class called TestCard1 - because TestCard1 is public and Card1 isn't.
 * 2. <nothing> - classes that don't have any keyword in front of 'class' are visible to all code in the same
 * *package* - since we haven't done packages yet, and all the code we've written has been in the 'default'
 * package, there's no real difference.
 * 3. private and protected - which are tricky and we won't do them in this module (at least not for classes: we
 * will do private for other things).
 *
 * Since the whole point of the Card class is that it's going to be visible to all the rest of our code, it seems
 * to make sense to make it public. We can do that (and will) but we will then have to put the TestCard class in
 * a different file. 
 * 
 * If we do that, we need to compile *both* of them to run - and the result will be two separate class files.
 * But also notice that when we compiled TestCard1, that *also* produces two class files - one for TestCard1 and
 * one for Card1. Java always puts the code for each class in it's own .class file
 *
 * Other than being public, this class is the same as the last one.
 */

public class Card2 {
	
	String name;
	
	int value;
	
	String suite;

}


