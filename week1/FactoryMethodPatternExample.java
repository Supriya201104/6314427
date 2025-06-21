
interface Document 
{
    void open();
}
class WordDocument implements Document 
{
    public void open() 
    {
        System.out.println("Opening Word");
    }
}

class PdfDocument implements Document 
{
    public void open() 
    {
        System.out.println("Opening PDF");
    }
}

class ExcelDocument implements Document 
{
    public void open() 
    {
        System.out.println("Opening Excel");
    }
}

abstract class DocumentFactory 
{
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory 
{
    public Document createDocument() 
    {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory 
{
    public Document createDocument() 
    {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory 
{
    public Document createDocument() 
    {
        return new ExcelDocument();
    }
}

public class FactoryMethodPatternExample 
{
    public static void main(String[] args) 
    { 
        DocumentFactory wf = new WordFactory();
        Document wordDoc = wf.createDocument();
        wordDoc.open();
        DocumentFactory pf = new PdfFactory();
        Document pdfDoc = pf.createDocument();
        pdfDoc.open();
        DocumentFactory ef = new ExcelFactory();
        Document excelDoc = ef.createDocument();
        excelDoc.open();
    }
}
