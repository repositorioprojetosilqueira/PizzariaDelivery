package view;

import java.io.OutputStream;
import java.sql.Connection;
import java.util.Map;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class geradorRelatorios {
	
	private Connection conexao;

    public geradorRelatorios(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void geraPdf(String jrxml, Map<String, Object> parametros, OutputStream saida) {

            try {

                // compila jrxml em memoria
                JasperReport jasper = JasperCompileManager.compileReport(jrxml);

                // preenche relatorio
                JasperPrint print = JasperFillManager.fillReport(jasper, parametros, this.conexao);

                // exporta para pdf
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, saida);

                exporter.exportReport();

            } catch (Exception e) {
                throw new RuntimeException("Erro ao gerar relat�rio", e);
            }
        }   
}