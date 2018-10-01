package com.telstra.coco;

import java.util.ArrayList;

public class main {
    public  void main()
    {
        String line = "#@AUP-1 #comment finish... #testing testing";
        ParsingCommentFeature p= new ParsingCommentFeature(line);
        ArrayList<String> content = p.parsing();

    }
}
