package Pages;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;

class PdfWriterLocal {

    public static PdfWriterLocal getInstance(Document doc, FileOutputStream fileOutputStream) {
        // Local placeholder - not used by billing code. Keep non-public to avoid conflict with iText PdfWriter.
        throw new UnsupportedOperationException("Unimplemented method 'getInstance'");
    }

}
