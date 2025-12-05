package p4;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class ConvertToUpper extends BodyTagSupport {
	@Override
	public int doStartTag() throws JspException {
		
		return EVAL_BODY_BUFFERED;
	}
 @Override
public int doEndTag() throws JspException {
		JspWriter out= pageContext.getOut();
	 try {
		String body=bodyContent.getString();
				out.print(body.toUpperCase());
		
	} catch (Exception e) {
		
	}
	return super.doEndTag();
}  
}
