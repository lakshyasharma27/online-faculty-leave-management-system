package org.apache.jsp.GITSLms.preview.Geetanjali.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjspnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!--<![endif]-->\n");
      out.write("    <!-- BEGIN HEAD -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>LMS | Admin Dashboard</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\n");
      out.write("        <meta content=\"Preview page of Metronic Admin Theme #1 for statistics, charts, recent events and reports\" name=\"description\" />\n");
      out.write("        <meta content=\"\" name=\"author\" />\n");
      out.write("        <!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("     \n");
      out.write("        <link href=\"../assets/global/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/plugins/simple-line-icons/simple-line-icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("     \n");
      out.write("        <!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("       \n");
      out.write("        <link href=\"../js/fullcalendar.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("        <!-- BEGIN THEME GLOBAL STYLES -->\n");
      out.write("       \n");
      out.write("        <link href=\"../assets/global/css/plugins.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- END THEME GLOBAL STYLES -->\n");
      out.write("        <!-- BEGIN THEME LAYOUT STYLES -->\n");
      out.write("        <link href=\"../assets/layouts/layout/css/layout.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/layouts/layout/css/themes/darkblue.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\" />\n");
      out.write("           <script type=\"text/javascript\" src=\"../js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("  $(document).ready(function(){\n");
      out.write("        var myJSON; \n");
      out.write("        $.ajax({     url:'getevents.jsp',\n");
      out.write("                     type:'get',\n");
      out.write("                     dataType:'json',\n");
      out.write("                     success:function( response)\n");
      out.write("                     {   \n");
      out.write("                            $('#calendar').fullCalendar({\n");
      out.write("\t\t\t\t  header: {\n");
      out.write("\t\t\t\t\tleft: 'prev,next today',\n");
      out.write("\t\t\t\t\tcenter: 'title',\n");
      out.write("\t\t\t\t\tright: 'month,agendaWeek,agendaDay'\n");
      out.write("\t\t\t\t  },\n");
      out.write("\t\t\t\t  events: response \n");
      out.write("\t\t\t\t           \n");
      out.write("                              });\n");
      out.write("                     },\n");
      out.write("                     error:function()\n");
      out.write("                     {\n");
      out.write("                         alert(\"error\");\n");
      out.write("                     }\n");
      out.write("                     \n");
      out.write("                 });\n");
      out.write("                    \n");
      out.write("});\n");
      out.write("     \n");
      out.write(" // We will refer to $calendar in future code\n");
      out.write("/*$(document).ready(function() {\n");
      out.write("    var $calendar = $(\"#calendar\").fullCalendar({\n");
      out.write("   \n");
      out.write("   header: {\n");
      out.write("    left: 'title',\n");
      out.write("    right: 'today,month,agendaDay,agendaWeek prev,next'\n");
      out.write("   },\n");
      out.write(" \n");
      out.write("   // Make possible to respond to clicks and selections\n");
      out.write("   selectable: true,\n");
      out.write(" \n");
      out.write("   // This is the callback that will be triggered when a selection is made.\n");
      out.write("   // It gets start and end date/time as part of its arguments\n");
      out.write("   select: function(start, end, jsEvent, view) {\n");
      out.write(" \n");
      out.write("     // Ask for a title. If empty it will default to \"New event\"\n");
      out.write("     var title = prompt(\"Enter a title for this event\", \"New event\");\n");
      out.write(" \n");
      out.write("     // If did not pressed Cancel button\n");
      out.write("     if (title !== null) {\n");
      out.write("      // Create event\n");
      out.write("      var event = {\n");
      out.write("       title: title.trim() !== \"\" ? title : \"New event\",\n");
      out.write("       start: start,\n");
      out.write("       end: end\n");
      out.write("       \n");
      out.write("      };\n");
      out.write("     //alert(title);\n");
      out.write("      $.ajax({\n");
      out.write("                    type: \"post\",\n");
      out.write("                    url: \"eventstodb.jsp\", //here you can use servlet,jsp, etc\n");
      out.write("                    data: \"end=\" +end.toString()+\"&start=\"+start.toString()+\"&title=\"+title.toString(),\n");
      out.write("                    success: function(){      \n");
      out.write("                            alert(\"successful\"+start.toString());\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("         \n");
      out.write("      // Push event into fullCalendar's array of events\n");
      out.write("      // and displays it. The last argument is the\n");
      out.write("      // \"stick\" value. If set to true the event\n");
      out.write("      // will \"stick\" even after you move to other\n");
      out.write("      // year, month, day or week.\n");
      out.write(" \n");
      out.write("      $calendar.fullCalendar(\"renderEvent\", event, true);\n");
      out.write("     };\n");
      out.write("     // Whatever happens, unselect selection\n");
      out.write("     $calendar.fullCalendar(\"unselect\");\n");
      out.write(" \n");
      out.write("    }, // End select callback\n");
      out.write("    // eventAfterRender: function (event, element, view) {\n");
      out.write("      //              birthday = new Date('<somedate>');\n");
      out.write("          //          year = new Date(event.start).getFullYear();\n");
      out.write("        //            month = new Date(event.start).getMonth();\n");
      out.write("            //        day = new Date(event.start).getDate();\n");
      out.write("              //      var name=event.title;\n");
      out.write("                //    alert(year + ' ' + month + ' ' + day+' '+name);\n");
      out.write("   // window.location.replace(\"addfacultybean.jsp?mail=\"+mail.value+\"&pass=\"+pass.value+\"&gender=\"+gender.value);                \n");
      out.write("    //do some if statement to see if the year matches then if the month, then the day. \n");
      out.write("//if so then go to another function or just put the code here for the pop \n");
      out.write("\n");
      out.write("            //    },\n");
      out.write("    // Make events editable, globally\n");
      out.write("    editable : true,\n");
      out.write(" \n");
      out.write("    // Callback triggered when we click on an event\n");
      out.write(" \n");
      out.write("    eventClick: function(event, jsEvent, view){\n");
      out.write("     // Ask for a title. If empty it will default to \"New event\"\n");
      out.write("     var newTitle = prompt(\"Enter a new title for this event\", event.title);\n");
      out.write(" \n");
      out.write("     // If did not pressed Cancel button\n");
      out.write("     if (newTitle !== null) {\n");
      out.write("          // Update event\n");
      out.write("          event.title = newTitle.trim() !== \"\" ? newTitle : event.title;\n");
      out.write(" \n");
      out.write("          // Call the \"updateEvent\" method\n");
      out.write("          $calendar.fullCalendar(\"updateEvent\", event);\n");
      out.write(" \n");
      out.write("        }\n");
      out.write("    } // End callback eventClick\n");
      out.write("  } // End of calendar options\n");
      out.write(" );\n");
      out.write("});*/\n");
      out.write("/*function loud(start,title,end)\n");
      out.write("{// alert(start);\n");
      out.write(" // alert(title);  \n");
      out.write(" // alert(end);\n");
      out.write("  $.ajax({\n");
      out.write("                    type: \"post\",\n");
      out.write("                    url: \"eventstodb.jsp\", //here you can use servlet,jsp, etc\n");
      out.write("                    data: \"end=\" +end+\"&start=\"+start+\"&title=\"+title,\n");
      out.write("                    success: function(){      \n");
      out.write("                            alert(\"successful\"+title);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("}*/\n");
      out.write("     \n");
      out.write("    </script>\n");
      out.write("        <!-- END THEME LAYOUT STYLES -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" /> </head>\n");
      out.write("    <!-- END HEAD -->\n");
      out.write("\n");
      out.write("    <body class=\"page-header-fixed page-sidebar-closed-hide-logo page-content-white\">\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <!-- include HEADER-->\n");
      out.write("           \n");
      out.write("            \n");
      out.write("             <!-- end HEADER -->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!-- BEGIN HEADER & CONTENT DIVIDER -->\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("            <!-- END HEADER & CONTENT DIVIDER -->\n");
      out.write("            <!-- BEGIN CONTAINER -->\n");
      out.write("            <div class=\"page-container\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <!-- include SIDEBAR -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!-- END SIDEBAR -->\n");
      out.write("                <!-- BEGIN CONTENT -->\n");
      out.write("                <div class=\"page-content-wrapper\">\n");
      out.write("                    <!-- BEGIN CONTENT BODY -->\n");
      out.write("                    <div class=\"page-content\">\n");
      out.write("                        <!-- BEGIN PAGE TITLE-->\n");
      out.write("                        <h1 class=\"page-title\"> Faculty Dashboard\n");
      out.write("                        </h1>\n");
      out.write("                        <!-- END PAGE TITLE-->\n");
      out.write("                        <!-- END PAGE HEADER-->\n");
      out.write("                        <!-- BEGIN DASHBOARD STATS 1-->\n");
      out.write("                        \n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <!-- END DASHBOARD STATS 1-->\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-lg-6 col-xs-12 col-sm-12\">\n");
      out.write("                                <!-- BEGIN PORTLET-->\n");
      out.write("                                <div class=\"portlet light calendar bordered\">\n");
      out.write("                                    <div class=\"portlet-title \">\n");
      out.write("                                        <div class=\"caption\">\n");
      out.write("                                            <i class=\"icon-calendar font-dark hide\"></i>\n");
      out.write("                                            <span class=\"caption-subject font-dark bold uppercase\">Feeds</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                   \n");
      out.write("                                        <div id=\"calendar\"> </div>\n");
      out.write("                                   \n");
      out.write("                                </div>\n");
      out.write("                                <!-- END PORTLET-->\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>                        \n");
      out.write("   \n");
      out.write("                    <!-- END CONTENT BODY -->\n");
      out.write("                </div>\n");
      out.write("                <!-- END CONTENT -->\n");
      out.write("                <!-- BEGIN QUICK SIDEBAR -->\n");
      out.write("                <a href=\"javascript:;\" class=\"page-quick-sidebar-toggler\">\n");
      out.write("                    <i class=\"icon-login\"></i>\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                <!-- END QUICK SIDEBAR -->\n");
      out.write("            </div>\n");
      out.write("            <!-- END CONTAINER -->\n");
      out.write("            <!-- BEGIN FOOTER -->\n");
      out.write("           \n");
      out.write("           <!-- END FOOTER -->\n");
      out.write("        </div>\n");
      out.write("        <!-- BEGIN CORE PLUGINS -->\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        <!-- END CORE PLUGINS -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("        <script src=\"../js/moment.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/fullcalendar.min.js\" type=\"text/javascript\"></script>\n");
      out.write("     <!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("        <!-- BEGIN THEME GLOBAL SCRIPTS -->\n");
      out.write("        <script src=\"../assets/global/scripts/app.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END THEME GLOBAL SCRIPTS -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("        <script src=\"../assets/pages/scripts/dashboard.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END PAGE LEVEL SCRIPTS -->\n");
      out.write("       \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}