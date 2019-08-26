import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class main {
	
	//VARIABLES
	static ArrayList<Novela> novelas = new ArrayList<Novela>();
	
	//LLAMADAS
	static LeerExcel readExcel = new LeerExcel();
	
	public static void main(String[] args) throws IOException {
		
		//Fichero Excel
		File fileExcel = new File("D:\\Documents\\TRACE\\Excel Novelas\\BD_Catálogo_TRACEni_1970-1978.xlsx");
		
		//Crear lista de novelas
		readExcel.creaListNovela(fileExcel);
		
		for(int i = 0; i < ValoresEstaticos.novelass.size(); i++ ) {
			
			System.out.println(ValoresEstaticos.novelass.get(i).getTituloMeta()+"    "+ValoresEstaticos.novelass.get(i).getTituloOriginal());
		}
		

	}
}
