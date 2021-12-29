
package Insurance;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;


class ClientTest {

    @Test
    void add_details() {

        System.out.println("Update test case run");
        Client instance = new Client();
        Vector<String> note = new Vector<String>();
        boolean expresult = false;
        boolean result, res;

        int Phone, cnt;
        cnt = instance.df.getRowCount();
        String n = instance.df.getValueAt(cnt - 1, 0).toString();
        Phone = Integer.parseInt(n);

        instance.ephone.setText(n);
        instance.ename.setText("krupa");
        instance.eaddress.setText("abbxx");


        result = instance.add_details();
        note.add(n);
        note.add("krupa");
        note.add("abbxx");

        assertEquals(expresult,result);

    }
}

//  @Test
//    public void testRegister()
//        {
//        Client instance = new Client();
//
//        instance.ephone.setText(n);
//        instance.ename.setText("krupa");
//        instance.eaddress.setText("abbxx");
//
//        memberDao.register(member);
//        Long id = member.getId();
//        Assert.assertNotNull(id);
//
//        Assert.assertEquals(2, memberDao.findAllOrderedByName().size());
//        Member newMember = memberDao.findById(id);
//
//        Assert.assertEquals("Jane Doe", newMember.getName());
//        Assert.assertEquals("jane.doe@mailinator.com", newMember.getEmail());
//        Assert.assertEquals("2125552121", newMember.getPhoneNumber());
//        return;
