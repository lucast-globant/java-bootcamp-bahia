package key3;

import key2.House;
import key3.HospitalFactory.Type;

public class HospitalFactory {
	
	public enum Type {
	    PRIVADO, MUNICIPAL 
	}

	/*public Hospital createHospital(Type hospitalType) {
		 switch ( hospitalType ) {
	      case PRIVADO:{
	           return new Privado();
	      }
	      case MUNICIPAL:{
	           return new Municipal();
	      }
	      default:
	           System.out.println("error" );
	           break;
	      }
		return null;
	}*/
	
	public Hospital createHospital(Type hospitalType) {
		HospitalDirector hd=new HospitalDirector();
		HospitalBuilder hb;
		 switch ( hospitalType ) {
	      case PRIVADO:{
	    	   hb=new PrivadoBuilder();
	    	   return hd.constructHospital(hb);
	      }
	      case MUNICIPAL:{
	    	  hb=new MunicipalBuilder();
	    	  return hd.constructHospital(hb);
	      }
	      default:
	           System.out.println("error" );
	           break;
	      }
		return null;
	}
	
}
