/*******************************************************************************
 * Copyright (c) 2015 btows.com.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.cleanwiz.applock.data;

import android.content.pm.ApplicationInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CommLock.
 */
public class CommLockInfo {

	private Long id;
	private String packageName;
	private Boolean isLocked;
	private Boolean isFaviterApp;
	private ApplicationInfo appInfo;

	public CommLockInfo() {
	}

	public CommLockInfo(Long id) {
		this.id = id;
	}

	public CommLockInfo(Long id, String packageName, Boolean isLocked,
			Boolean isFaviterApp) {
		this.id = id;
		this.packageName = packageName;
		this.isLocked = isLocked;
		this.isFaviterApp = isFaviterApp;
	}

	public ApplicationInfo getAppInfo() {
		return appInfo;
	}

	public void setAppInfo(ApplicationInfo appInfo) {
		this.appInfo = appInfo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Boolean getIsFaviterApp() {
		return isFaviterApp;
	}

	public void setIsFaviterApp(Boolean isFaviterApp) {
		this.isFaviterApp = isFaviterApp;
	}

}
