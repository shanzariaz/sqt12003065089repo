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
public class deleteNode extends TestCase {
    
    public deleteNode(String testName) {
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

    public void testDeletenode(){
        GitBST n=new GitBST();
        n.insertNode(10);
        n.insertNode(19);
        n.insertNode(80);
        n.insertNode(60);
        assertTrue("not in the BST",n.deleteNode(01));
        assertTrue("deleted",n.deleteNode(80));
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
