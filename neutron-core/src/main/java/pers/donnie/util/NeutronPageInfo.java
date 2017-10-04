package pers.donnie.util;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 *
 */
public class NeutronPageInfo<T> implements Serializable {

	//1.当前页
	private int currentPage;
	//2.每页显示条数
	private int pageSize;
	//3.总页数
	private int total;
	//4.总记录数
	private int count;
	//5.上一页
	private int prePage;
	//6.下一页
	private int nextPage;
	//7.是否有上一页
	private boolean hasPre;
	//8.是否有下一页
	private boolean hasNext;
	//9.返回结果
	private List<T> result;

	//构造函数1
	public NeutronPageInfo() {
		super();
	}
	//构造函数2
	public NeutronPageInfo(int currentPage, int pageSize) {
		super();
		this.currentPage = (currentPage<1)?1:currentPage;
		this.pageSize = pageSize;
		//是否有上一页
		this.hasPre = (currentPage==1)?false:true;
		//是否有下一页
		this.hasNext = (currentPage==total)?false:true;
		//上一页
		if(hasPre){
			this.prePage = (currentPage-1);
		}
		//下一页
		if(hasNext){
			this.nextPage = currentPage+1;
		}

	}
	//构造函数3
	public NeutronPageInfo(int currentPage, int pageSize, int count) {
		super();
		this.currentPage = (currentPage<1)?1:currentPage;
		this.pageSize = pageSize;
		this.count = count;
		//计算总页数
		if(count==0){
			this.total = 0;
		}else{
			this.total = (count%pageSize==0)?(count/pageSize):(count/pageSize+1);
		}
		//是否有上一页
		this.hasPre = (currentPage==1)?false:true;
		//是否有下一页
		this.hasNext = (currentPage==total)?false:true;
		//上一页
		if(hasPre){
			this.prePage = (currentPage-1);
		}
		//下一页
		if(hasNext){
			this.nextPage = currentPage+1;
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrePage() {
		return prePage;
	}
	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public boolean isHasPre() {
		return hasPre;
	}
	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}
	public boolean isHasNext() {
		return hasNext;
	}
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "EgoPageInfo [currentPage=" + currentPage + ", pageSize=" + pageSize + ", total=" + total + ", count="
				+ count + ", prePage=" + prePage + ", nextPage=" + nextPage + ", hasPre=" + hasPre + ", hasNext="
				+ hasNext + ", result=" + result + "]";
	}
}
