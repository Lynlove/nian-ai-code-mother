package com.lyn.nianaicodemother.ai.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;
import lombok.ToString;

@Description("生成多个代码文件的结果")
@Data
public class MultiFileCodeResult {

    @Description("HTML代码")
    private String htmlCode;

    @Description("CSS代码")
    private String cssCode;

    @Description("JS代码")
    private String jsCode;

    @Description("生成代码的描述")
    private String description;
}

