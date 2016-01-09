/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import gitbst.GitBST;
import junit.framework.TestCase;

/**
 *
 * @author Shanza Riaz Mughal
 */
public class InsertNode extends TestCase {
    
    public InsertNode(String testName) {
        super(testName);
    }
    // called before a test is executed
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    // called after a test is executed
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    //test method
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
    public void testInsert(){
        GitBST i=new GitBST();
        i.insertNode(21);
        i.insertNode(61);
        assertTrue("Present in BST",i.searchNode(21));
        assertTrue("Present in BST",i.searchNode(61));
        assertTrue("Not in BST", i.searchNode(90));
    }
}
