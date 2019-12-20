package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Kqjilu;
import com.woniu.service.IKqjiluService;

@Controller
public class KqjiluAction {

	  @Autowired
	  private IKqjiluService ks;
	  private Kqjilu kq;
	  private List<Kqjilu> kqs;
	public IKqjiluService getKs() {
		return ks;
	}
	public void setKs(IKqjiluService ks) {
		this.ks = ks;
	}
	public Kqjilu getKq() {
		return kq;
	}
	public void setKq(Kqjilu kq) {
		this.kq = kq;
	}
	
	  
	  public List<Kqjilu> getKqs() {
		return kqs;
	}
	public void setKqs(List<Kqjilu> kqs) {
		this.kqs = kqs;
	}
	public String kqList() {
		  kqs = ks.findAll();
		 // System.out.println(kqs);
		 // System.out.println(kqs.get(0).toString());
		  return "kqList";
	  }
}
