--[[
    Solving a new alphabet problem
    https://open.kattis.com/problems/anewalphabet
]]

local letters = {
    ["a"] = "@",
    ["b"] = "8",
    ["c"] = "(",
    ["d"] = "|)",
    ["e"] = "3",
    ["f"] = "#",
    ["g"] = "6",
    ["h"] = "[-]",
    ["i"] = "|",
    ["j"] = "_|",
    ["k"] = "|<",
    ["l"] = "1",
    ["m"] = "[]\\/[]",
    ["n"] = "[]\\[]",
    ["o"] = "0",
    ["p"] = "|D",
    ["q"] = "(,)",
    ["r"] = "|Z",
    ["s"] = "$",
    ["t"] = "][",
    ["u"] = "|_|",
    ["v"] = "\\/",
    ["w"] = "\\/\\/",
    ["x"] = "}{",
    ["y"] = "`/",
    ["z"] = "2"
}

local translated = {}

local input = io.read("l")

for c in input:gmatch(".") do
    if letters[c:lower()] ~= nil then
        table.insert(translated, letters[c:lower()])
    else
        table.insert(translated, c)
    end
end

print(table.concat(translated))