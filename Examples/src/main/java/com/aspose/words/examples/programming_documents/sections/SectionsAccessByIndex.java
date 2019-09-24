package com.aspose.words.examples.programming_documents.sections;

import com.aspose.words.Document;
import com.aspose.words.Section;
import com.aspose.words.examples.Utils;

public class SectionsAccessByIndex {

    public static void main(String[] args) throws Exception {

        //ExStart:SectionsAccessByIndex
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SectionsAccessByIndex.class);
        Document doc = new Document(dataDir + "Document.doc");
        Section section = doc.getSections().get(0);
        section.getPageSetup().setLeftMargin(90); // 3.17 cm
        section.getPageSetup().setRightMargin(90); // 3.17 cm
        section.getPageSetup().setTopMargin(72); // 2.54 cm
        section.getPageSetup().setBottomMargin(72); // 2.54 cm
        section.getPageSetup().setHeaderDistance(35.4); // 1.25 cm
        section.getPageSetup().setFooterDistance(35.4); // 1.25 cm
        section.getPageSetup().getTextColumns().setSpacing(35.4); // 1.25 cm
        //ExEnd:SectionsAccessByIndex

        System.out.println(section.getText());
    }
}