package capgeminiSprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capemini.daos.RawMaterialRepository;
//import com.capgemini.services.UpdateRawMaterialStatus;

class RawMaterialDeliveryStatusTest {

	@Test
	void test() {
		
		String s=RawMaterialRepository.str();
		assertEquals("Successfully",s);
	}
	
}
