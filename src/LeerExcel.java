import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class LeerExcel {
	//XSS
	static XSSFRow valorCelda;
	static XSSFCell celda;
	//Variables
	Novela novela;
	static ArrayList<Novela> novelas = new ArrayList<Novela>();
	static int filas;
	static int columnas;
	static String stringValorCelda;
	//Listas
	static InputStream inputExcel = null;
	
	
	
	/* public static void main(String[] args) throws IOException {
	
	        String excelFilePath = "C:/Users/User/Documents/TRACE/Excel Novelas/BD_Catálogo_TRACEni_1970-1978.xlsx";
	        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	         
	        Workbook workbook = new XSSFWorkbook(inputStream);
	        Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	         
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	             
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	                switch (cell.getCellType()) {
	                    case STRING:
	                        System.out.print(cell.getStringCellValue());
	                        break;
	                    case BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue());
	                        break;
	                    case NUMERIC:
	                        System.out.print(cell.getNumericCellValue());
	                        break;
					default:
						System.out.print("ERROR");
						break;
	                }
	                System.out.print(" - ");
	            }
	            System.out.println();
	        }
	         
	        workbook.close();
	        inputStream.close();
	    }
	 */
	public void creaListNovela(File fileExcel) {
		try {
			inputExcel = new FileInputStream(fileExcel);
			XSSFWorkbook parametro = new XSSFWorkbook(inputExcel);
			XSSFSheet leerFilCoum = parametro.getSheetAt(0);                       
            filas = leerFilCoum.getLastRowNum();
            columnas = 0;         
			
            for(int r=1; r<3; r++) {
            	novela = new Novela();
            	valorCelda = leerFilCoum.getRow(r);
            	
            	if(valorCelda == null) {
            		//Si no existe este valor la celda no se recorre
            	}else {
            		for(int c=1; c < (columnas = valorCelda.getLastCellNum());c++) {
            			stringValorCelda = valorCelda.getCell(c) == null?"":(valorCelda.getCell(c).getCellType() == CellType.STRING)?valorCelda.getCell(c).getStringCellValue():(valorCelda.getCell(c).getCellType() == CellType.NUMERIC)?"" + valorCelda.getCell(c).getNumericCellValue():(valorCelda.getCell(c).getCellType() == CellType.BOOLEAN)?"" + valorCelda.getCell(c).getBooleanCellValue():(valorCelda.getCell(c).getCellType() == CellType.BLANK)?"BLANK":(valorCelda.getCell(c).getCellType() == CellType.FORMULA)?"FORMULA":(valorCelda.getCell(c).getCellType() == CellType.ERROR)?"ERROR":"";

            			switch (c) {
            				case 1:
            					novela.setTituloOriginal(stringValorCelda);
            					
            				break;
            				case 2:
            					novela.setTituloMeta(stringValorCelda);
            					
            				break;
            				case 3:
            					novela.setTitulosIncluidos(stringValorCelda);
            					
            				break;
            				case 4:
            					novela.setTitulosNormalizados(stringValorCelda);
            					
            				break;
            				case 5:
            					novela.setIsbn(stringValorCelda);
            					
            				break;
            				case 6:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 7:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 8:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 9:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 10:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				
            				case 11:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 12:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 13:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 14:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 15:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 16:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				
            				case 17:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 18:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				
            				case 19:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 20:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 21:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 22:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 23:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 24:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 25:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 26:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 27:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 28:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 29:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 30:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 31:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 32:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 33:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 34:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 35:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 36:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            				case 37:
            					novela.setCalificacion(stringValorCelda);
            					
            				break;
            			}
            			
            		}
            	}
            	ValoresEstaticos.novelass.add(novela);
            }
           
		} catch (FileNotFoundException notFound) 
        {
            System.out.println("El fichero no fue encontrado: " + notFound);
        } 
        catch (IOException process) 
        {
            System.out.println("Error al procesarlo: " + process);
        } 
        finally 
        {
            try 
            {
                inputExcel.close();
            } 
            catch (IOException close) 
            {
                System.out.println("Error al cerrar el fichero: " + close);
            }
        }
		
	}
}
