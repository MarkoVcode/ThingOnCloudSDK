/**
 *  Copyright 2015 MarkoV
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * 					ThingOnCloud.com SDK
 * 
 * Project home: https://github.com/MarkoVcode/ThingOnCloudSDK
 * 
 * @build <BUILDTAG> 
 * @date <BUILDDATE>
 * @version <RELEASEVERSION>
 */
package com.thingoncloud.bean;

import java.io.Serializable;

public class Page implements Serializable {

	private static final long serialVersionUID = -3346529837063257355L;

	private Long totalPages;
	private Long currentPage;
	private Long valuesPerPage;
	private Long collectionSize;
	private Integer onPage;
	private Ref next;
	private Ref prev;
	
	public Long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getValuesPerPage() {
		return valuesPerPage;
	}
	public void setValuesPerPage(Long valuesPerPage) {
		this.valuesPerPage = valuesPerPage;
	}
	public Long getCollectionSize() {
		return collectionSize;
	}
	public void setCollectionSize(Long collectionSize) {
		this.collectionSize = collectionSize;
	}
	public Integer getOnPage() {
		return onPage;
	}
	public void setOnPage(Integer onPage) {
		this.onPage = onPage;
	}
	public Ref getNext() {
		return next;
	}
	public void setNext(Ref next) {
		this.next = next;
	}
	public Ref getPrev() {
		return prev;
	}
	public void setPrev(Ref prev) {
		this.prev = prev;
	}
}
