package pranav.Repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pranav.Model.User;

@Repository
public interface Userrepository extends JpaRepository< User , Integer>{

	
	@Transactional 
	@Modifying
	@Query(value="UPDATE userisON u SET u.name=:name , u.email=:email WHERE u.id=:id " , nativeQuery =true )
    public void update(String name,String  email ,int id );

	
	@Query(value="SELECT * FROM userisON u WHERE u.name LIKE %:text%", nativeQuery =true )
	public List<User> search(String text);


}
