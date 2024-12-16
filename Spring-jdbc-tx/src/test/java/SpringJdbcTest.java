import com.mydemo.entity.User;
import com.mydemo.config.SpringConfig;
import com.mydemo.entity.Voucher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SpringJUnitConfig(classes = SpringConfig.class)
public class SpringJdbcTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @Transactional(timeout = 3,noRollbackFor = ArithmeticException.class)
    public void test01() {
        String SQL = "SELECT ID FROM tb_shop WHERE name = '102茶餐厅'";
        String ID = jdbcTemplate.queryForObject(SQL, String.class);
        SQL = "SELECT * FROM tb_voucher WHERE shop_id = ?";
        List<Voucher> voucherList = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Voucher.class),ID);
        System.out.println(voucherList);
        int i = 1/0;
    }

    @Test
    public void test02(){
        String SQL = "SELECT * FROM tb_voucher LEFT JOIN tb_shop ON tb_shop.id = tb_voucher.shop_id  WHERE tb_shop.name = '102茶餐厅'";
        List<Voucher> voucherList = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Voucher.class));
        System.out.println(voucherList);
    }
}
