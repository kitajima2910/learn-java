<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : DisplayStudentList.xsl
    Created on : April 14, 2020, 9:07 AM
    Author     : Lan-T
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>DisplayStudentList.xsl</title>
                <style>
                    table {
                        border-collapse: collapse;
                    }
                    table, tr, td, th {
                        border: 1px solid #000;
                    }
                </style>
            </head>
            <body>
                <center>
                    <h1>Scholarship List</h1>
                    <h3>Class: <xsl:value-of select="StudentList/Class"/></h3>
                    <table>
                        
                        <tr>
                            <th>Code</th>
                            <th>Name</th>
                            <th>Marks</th>
                        </tr>
                        
                        <xsl:for-each select="StudentList/Student">
                            <tr>
                                <td><xsl:value-of select="Code"/></td>
                                <td><xsl:value-of select="Name"/></td>
                                <td><xsl:value-of select="Mark"/></td>
                            </tr>
                        </xsl:for-each>
                        
                    </table>
                </center>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
