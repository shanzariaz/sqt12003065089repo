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
public class inOrder extends TestCase {
    
    public inOrder(String testName) {
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

    public void testinOrder(){
        GitBST i=new GitBST();
        String snew="20,40,10,69,70";
	String sf=i.inOrder();
	assertTrue(snew.equals(sf));
 	         
       
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
