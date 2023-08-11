-- read the file, get every line as an item of a list
set baseNamesList to paragraphs of (read "doi.txt")

repeat with baseName in baseNamesList
	
	-- open dx.doi.org/{DOI} in Safari
	set searchURL to "http://dx.doi.org/" & baseName
	tell application "Safari"
		activate
		open location searchURL
	end tell
	
	-- wait till load complete
	tell application "System Events" 
		tell process "Safari" 
			tell group 3 of toolbar 1 of front window
				repeat until exists (first button where its accessibility description = "Reload this page")
					delay 0.5
				end repeat
			end tell
		end tell
	end tell
	tell application "System Events" to key code 121
	delay 0.5
	
	-- enter reader mode
	tell application "System Events"
		click menu item "Show Reader" of menu "View" of menu bar item "View" of menu bar 1 of application process "Safari"
		delay 0.5
	end tell
	
	-- get text of webpage
	tell application "Safari" to activate
	tell application "System Events"
		keystroke "a" using command down
		delay 0.5
		keystroke "c" using command down
		delay 0.5
	end tell
	
	-- paste text to txt file
	tell application "TextEdit"
		activate
		make new document
		tell application "System Events"
			keystroke "v" using command down
			delay 0.5
		end tell
		set unixPath to do shell script "pwd"
		set applePath to POSIX file unixPath as text
		save document 1 in file (applePath & ":txt:" & baseName & ".txt")
		close document 1 saving no
	end tell

	-- cleanup
	tell application "Safari" to close current tab of window 1
	
end repeat