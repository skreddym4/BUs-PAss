package org.cap.service;

import java.time.LocalDate;
import java.util.List;

import org.cap.model.LoginBean;
import org.cap.model.PassRequestForm;
import org.cap.model.Routetable;
import org.cap.model.TransactionBean;

public interface ILoginService {
	public abstract boolean checkUser(LoginBean loginBean);

	public abstract PassRequestForm createRequest(PassRequestForm busBean);
	public abstract List<Routetable> listAllRoutes();
	public abstract Routetable addRoute(Routetable newroute);
	public abstract List<String> PendingReqServlet();
	public List<PassRequestForm> pendingDetails();
	public abstract List<PassRequestForm> pendingDetailsOfEmp(String empid);
	public abstract Integer transaction(TransactionBean transaction);
	public List<TransactionBean> monthlyReport(LocalDate fdate, LocalDate tdate);
}
