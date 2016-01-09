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
public class printBst extends TestCase {
    
    public printBst(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void printbst(){
        GitBST i=new GitBST();
        i.insertNode(30);
        i.insertNode(40);
        i.insertNode(20);
        i.insertNode(15);
        assertTrue("your BST has values: "+ i.printBST(root));
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
