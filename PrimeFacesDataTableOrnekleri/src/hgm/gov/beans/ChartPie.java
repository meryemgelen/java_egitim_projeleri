package hgm.gov.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;

import lombok.Data;

@Named
@ManagedBean
@SessionScoped
@Data
public class ChartPie {
	private PieChartModel pieModel;

	public ChartPie() {
		pieModel = new PieChartModel();
		ChartData data = new ChartData();

		PieChartDataSet dataSet = new PieChartDataSet();
		List<Number> values = new ArrayList<>();
		values.add(12);
		values.add(50);
		values.add(6);
		values.add(1);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(255, 99, 132)");
		bgColors.add("rgb(54, 162, 235)");
		bgColors.add("rgb(255, 205, 86)");
		bgColors.add("rgb(255, 0, 0)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Eryaman");
		labels.add("K?z?lay");
		labels.add("Dikmen");
		labels.add("?in?in");
		data.setLabels(labels);
		pieModel.setData(data);
	}

}
